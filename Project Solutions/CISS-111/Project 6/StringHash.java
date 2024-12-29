public class StringHash {

    private Node[] buckets;
    private int numBuckets;
    private int count = 0;
    private boolean REHASH = false;
    static boolean DEBUG = false;

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


    private static class Node {
        String data;
        Node next;

        public Node(String s) {
            data = s;
            next = null;
        }
    }

    public StringHash(int b) {
        numBuckets = b;
        buckets = new Node[numBuckets];
    }

    // The KnR_2nd() method is a hash function described later.
    public void put(String s) {

        if (!REHASH && ((double) count / numBuckets) > .75)
            rehash();

        int b = KnR_2nd(s, numBuckets);
        Node n = new Node(s);

        if (get(s))
            return;
        n.next = buckets[b];
        buckets[b] = n;
        count++;
    }

    public boolean get(String s) {
        int b = KnR_2nd(s, numBuckets);
        Node p = buckets[b];

        while (p != null) {
            if (p.data.equals(s))
                return true;
            p = p.next;
        }
        return false;
    }

    public void remove(String s) {
        int b = KnR_2nd(s, numBuckets);
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

    private void rehash() {
        REHASH = true;

        Node[] oldBuckets = buckets;
        numBuckets *= 2;
        buckets = new Node[numBuckets];
        count = 0;

        for (int x = 0; x < oldBuckets.length; x++) {
            Node p = oldBuckets[x];
            while (p != null) {
                put(p.data);
                p = p.next;
            }
        }

        REHASH = false;
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
