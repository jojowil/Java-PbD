public class DirectChaining {

    /* Hash wrapper */
    public static int hash(String s, int b) {
        return KnR_2nd(s, b);
    }

    /* K&R 1st edition Hash */
    public static int KnR_1st(String s, int b) {

        int h = 0;
        int x, l = s.length();

        for (x = 0; x < l; x++)
            h = h + s.charAt(x);

        if (h < 0)
            h = -h;

        return h % b;
    }

    /* K&R 2nd edition Hash */
    public static int KnR_2nd(String s, int b) {

        int h = 0;
        int x, l = s.length();

        for (x = 0; x < l; x++)
            h = (h << 5) - h + s.charAt(x); // h * 31 + c

        if (h < 0)
            h = -h;

        return h % b;
    }

    static class HashTable {

        private Node[] buckets;
        private int numBuckets;
        private int count = 0;

        static boolean DEBUG = false;

        private static class Node {
            String data;
            Node next;

            public Node(String s) {
                data = s;
                next = null;
            }
        }

        public HashTable(int b) {
            numBuckets = b;
            buckets = new Node[numBuckets];
        }

        public void put(String s) {
            int b = hash(s, numBuckets);
            Node n = new Node(s);

            if (get(s))
                return;
            n.next = buckets[b];
            buckets[b] = n;
            System.out.println(s + " added to bucket " + b);
            count++;
        }

        public boolean get(String s) {
            int b = hash(s, numBuckets);
            Node p = buckets[b];

            while (p != null) {
                if (p.data.equals(s))
                    return true;
                p = p.next;
            }
            return false;
        }

        public void remove(String s) {
            int b = hash(s, numBuckets);
            Node p = buckets[b];

            // empty
            if (p == null)
                return;
            // head of chain
            if (p.data.equals(s))
                buckets[b] = p.next;
            else {
                // seek the value
                Node cur = p.next, back = p;
                while (cur != null) {
                    if (cur.data.equals(s)) {
                        back.next = cur.next;
                        break;
                    }
                    back = cur;
                    cur = cur.next;
                }
            }
            count--;
        }

        private static String dumpList(Node l) {
            Node p = l;
            String s = "";
            while (p != null) {
                s = s + p.data + " ";
                p = p.next;
            }
            return s;
        }

        public String toString() {
            String s = "Hash Table: size " + count + ", buckets " + numBuckets + ":\n";
            for (int x = 0; x < numBuckets; x++)
                s += "bucket[" + x + "] -> " + dumpList(buckets[x]) + "\n";
            return s;
        }

    }

    public static void main(String[] args) {

        final int BUCKETS = 11;
        String[] words = {"192.168.10.2", "192.168.2.10", "192.168.1.3", "192.168.3.1",
                "192.168.1.6", "192.168.6.1"};
        HashTable ht = new HashTable(BUCKETS);

        for (String w : words)
            ht.put(w);

        System.out.println(ht);
    }
}
