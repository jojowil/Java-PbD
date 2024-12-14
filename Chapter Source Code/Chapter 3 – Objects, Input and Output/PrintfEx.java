public class PrintfEx {

    public static void main(String[] args) {

        String s = "Some string!";
        int x = 32, l;
        double pi = 3.14159;

        // columns from 1 to 30
        System.out.printf("         111111111122222222223%n");
        System.out.printf("123456789012345678901234567890%n");
        System.out.printf("------------------------------%n");

        // decimal integer occupying 10 columns. right then left justified.
        System.out.printf("%10d%n", x);
        System.out.printf("%-10d%n", x);

        // string occupying 30 columns. right then left justified.
        System.out.printf("%30s%n", s);
        System.out.printf("%-30s%n", s);

        // floating point value
        System.out.printf("%f%n", pi);
        // float in 10 columns. 5 for whole number value, one for
        // the decimal point and 4 for the fractional portion.
        System.out.printf("%10.4f%n", pi);
        System.out.printf("%.4f%n", pi);

        l = s.length();
        // strings, ints, and a char.
        System.out.printf("%nThe length of \"%s\" is %d%n", s, l);
        System.out.printf("The last char of \"%s\" is '%c'%n", s, s.charAt(l-1));
    }
}
