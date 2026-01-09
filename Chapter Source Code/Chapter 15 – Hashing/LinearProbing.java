public class LinearProbing {

    /* Hash wrapper */
    public static int hash(String s, int b) {
        return KnR_1st(s) % b;
    }

    /* K&R 1st edition Hash */
    public static int KnR_1st(String s) {
        int h = 0;
        int x, l = s.length();

        for (x = 0; x < l; x++)
            h = h + s.charAt(x);

        if (h < 0)
            h = -h;

        return h;
    }

    /* K&R 2nd edition Hash */
    public static int KnR_2nd(String s) {
        int h = 0;
        int x, l = s.length();

        for (x = 0; x < l; x++)
            h = (h << 5) - h + s.charAt(x); // h * 31 + c

        if (h < 0)
            h = -h;

        return h;
    }

    static class HashTable {
        private String[] buckets;
        private int numBuckets;
        private int count = 0;

        public HashTable(int b) {
            numBuckets = b;
            buckets = new String[numBuckets];
        }

        public void put(String s) {
            int b = hash(s, numBuckets);
            System.out.print(s + " hashed to bucket " + b + ". ");
            while (b < numBuckets && buckets[b] != null)
                b++;

            if (b >= numBuckets)
                throw new ArrayIndexOutOfBoundsException();

            buckets[b] = s;
            System.out.println(s + " added to bucket " + b);
            count++;
        }

        public boolean get(String s) {
            int b = hash(s, numBuckets);
            while (b < numBuckets && buckets[b] != null) {
                if (!buckets[b].equals(s))
                    return true;
                b++;
            }
            return false;
        }

        public void remove(String s) {
            int b = hash(s, numBuckets);

            while (b < numBuckets && buckets[b] != null) {
                if (buckets[b].equals(s)) {
                    buckets[b] = null;
                    count--;
                    return;
                }
                b++;
            }
        }

        public String toString() {
            StringBuilder s = new StringBuilder("Hash Table: size " + count + ", buckets " + numBuckets + ":\n");
            for (int x = 0; x < numBuckets; x++)
                s.append("bucket[").append(x).append("] -> ").append(buckets[x]).append("\n");
            return s.toString();
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
