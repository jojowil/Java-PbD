public class Reverse {

    public static void main(String[] args) {

        String s = "Fox on the lawn.", rev;
        int x;

        // pull each char from the String and show its position.
        for ( x = 0; x < s.length(); x++ )
            System.out.println("s.charAt(" + x + ") = " + s.charAt(x));

        // Create the reverse building a string working
        // from the end back toward the beginning.
        rev = "";
        for ( x = s.length() - 1; x >= 0; x-- )
            rev = rev + s.charAt(x);

        // print both original and reverse.
        System.out.println("\n" + s);
        System.out.println(rev);

    }
}
