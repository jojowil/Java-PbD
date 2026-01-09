public class SeriouslyHashingAround {

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

    /* sdbm Hash - Historically from Sleepycat's Berkeley DB. */
    public static int sdbm(String s) {
        int h = 0;
        int x, l = s.length();

        for (x = 0; x < l; x++)
            h = (h << 6) + (h << 16) - h + s.charAt(x); // h * 65599 + c

        if (h < 0)
            h = -h;

        return h;
    }

    /* Knuth's Multiplicative Hash - good for numeric key distribution. */
    public static int Knuth_mult(int i) {
        // 1001 1110 0011 0111 0111 1001 1011 0001
        return i * 0x9E3779B1;
    }

    /* Dan Bernstein's djb2 Hash starting at 5381 with 33 multiplier. */
    public static int djb2_Bernstein(String s) {
        int h = 5381;
        int x, l = s.length();

        for (x = 0; x < l; x++)
            h = ((h << 5) + h) + s.charAt(x); // h * 33 + c

        if (h < 0)
            h = -h;

        return h;
    }

    public static void main(String[] args) {
        final int BUCKETS = 181;
        String[] words = {"XYLOPHONE", "POTATO", "BOOTPRINT", "RING", "Ring", "ring", "COMMIT"};

        for (String w : words) {
            // change the hash function to see how things move around.
            int h = sdbm(w);
            int b = h % BUCKETS;

            System.out.println(w + " has hash value of " + h + " and exists in bucket " + b + ".");
        }
    }
}
