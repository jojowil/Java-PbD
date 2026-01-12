public class ConditionalStrings {

    public static void main(String[] args) {
        String r, s, t, u, v;

        r = "AAA";
        s = "AAA";
        t = "AAD";
        u = "AAADK";
        v = "FD";

        // a series of compareTo() calls to see how the Strings line up.
        System.out.println("r and s are lexicograhically equal.");
        System.out.println("r.compareTo(s) = " + r.compareTo(s));

        System.out.println("\nr is less than u based on length. (\"AAA\" matches the prefix).");
        System.out.println("r.compareTo(u) = " + r.compareTo(u));

        System.out.println("\nv is greater than t because 'F' - 'A' = 5. (Length is irrelevant here.)");
        System.out.println("v.compareTo(t) = " + v.compareTo(t));

        System.out.println("\ns is less than t because 'A' - 'D' = -3.");
        System.out.println("s.compareTo(t) = " + s.compareTo(t));

        System.out.println("\nt is greater than s because 'D' - 'A' = 3.");
        System.out.println("t.compareTo(s) = " + t.compareTo(s));

        /** Note that we are comparing the references!
         * This is the same as using equals() from
         * Object (the class from which all classes are
         * derived).
         */

        System.out.println("\nr and s are equal based on ==.");
        System.out.println("r == s is " + (r == s));

        System.out.println("\nr and s are equal based on equals().");
        System.out.println("r.equals(s) is " + r.equals(s));
    }
}
