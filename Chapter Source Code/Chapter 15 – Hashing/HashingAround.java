public class HashingAround {
    /**
     * Hash a string
     *
     * @param s string to be hashed
     * @return hash value
     */
    public static int hashValue(String s) {

        int h = 0;
        int x, l = s.length();

        for ( x = 0; x < l; x++ )
            h = (h << 5) - h + s.charAt(x);

        if ( h < 0 )
            h = -h;

        return h;
    }

    public static void main(String[] args) {

        final int BUCKETS = 181;
        String[] words = {"XYLOPHONE", "POTATO", "BOOTPRINT", "RING", "Ring", "ring", "COMMIT"};

        for ( String w : words ){
            int hv = hashValue(w);
            int b = hv % BUCKETS;

            System.out.println(w + " has a hash value of " + hv + " and exists in bucket " + b + ".");
        }
    }
}
