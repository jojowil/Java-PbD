public class HashingNoCollisionCheck {

    /* Hash wrapper */
    public static int hash(String s, int b) {
        return KnR_1st(s, b);
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

        private String[] buckets;
        private int numBuckets;
        private int count = 0;

        public HashTable(int b) {
            numBuckets = b;
            buckets = new String[numBuckets];
        }

        /**
         * Add a word to the has table.
         *
         * @param s string to be placed.
         */
        public void put(String s) {
            int b = hash(s, numBuckets);
            buckets[b] = s;
            System.out.println(s + " added to bucket " + b);
            count++;
        }

        /**
         * Check a word exists.
         *
         * @param s string to check
         * @return if available
         */
        public boolean get(String s) {
            int b = hash(s, numBuckets);
            if (buckets[b] != null)
                return true;
            return false;
        }

        /**
         * Remove a word.
         *
         * @param s word to be removed
         */
        public void remove(String s) {
            int b = hash(s, numBuckets);
            buckets[b] = null;
        }

        /**
         * Convert to a string.
         *
         * @return string representation of the table.
         */
        public String toString() {
            String s = "Hash Table: size " + count + ", buckets " + numBuckets + ":\n";
            for (int x = 0; x < numBuckets; x++)
                s += "bucket[" + x + "] -> " + buckets[x] + "\n";
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
