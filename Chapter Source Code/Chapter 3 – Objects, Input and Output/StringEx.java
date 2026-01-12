public class StringEx {

    public static void main(String[] args) {
        // set up some String reference vars.
        String s = "The quick brown fox jumps over the lazy dog.";
        String q, d, j;

        // some typical String operations.
        System.out.println("The length of s is " + s.length());
        System.out.println("s.toUpperCase() is " + s.toUpperCase());
        System.out.println("s.toLowerCase() is " + s.toLowerCase());

        // carving up String objects to form other String objects.
        q = s.substring(4, 9);
        d = s.substring(40, 43);
        j = s.substring(20, 25);

        System.out.println(q + " " + d + " " + j + ".");
    }
}
