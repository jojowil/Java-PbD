public class StringsAndChars {

    public static void main(String[] args) {
        //          0123456
        String s = "Abc-128";
        String t = "cHARLIE";
        String name;
        int i;
        char c;

        // Test if char is a letter and determine case
        c = s.charAt(1);
        System.out.println("\nFor the character '" + c + "'");
        System.out.println("Letter: " + Character.isLetter(c));
        System.out.println("Upper : " + Character.isUpperCase(c));
        System.out.println("Lower : " + Character.isLowerCase(c));

        // Test if char is a digit
        c = s.charAt(4);
        System.out.println("\nFor the character '" + c + "'");
        System.out.println("Digit : " + Character.isDigit(c));

        // Change the case of the string.
        c = t.charAt(0);
        name = Character.toUpperCase(c) + t.substring(1).toLowerCase();
        System.out.println("\nName  : " + name);

        // Take substring of s ("128") and convert to an int * 2.
        i = Integer.parseInt(s.substring(4)) * 2;
        System.out.println("\ni is  : " + i);

    }
}
