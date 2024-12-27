import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Project6b {

    public static boolean isBinary(String n) {
        return Pattern.matches("[01]+", n);
    }

    public static boolean isOctal(String n) {
        return Pattern.matches("[0-7]+", n);
    }

    public static boolean isDecimal(String n) {
        return Pattern.matches("[0-9]+", n);
    }

    public static boolean isHexadecimal(String n) {
        return Pattern.matches("[0-9A-Fa-f]+", n);
    }

    public static void baseConvert(String s, int radix) {
        System.out.println(s + " base " + radix + " is " + Integer.parseInt(s, radix) + " base 10.");
    }

    public static void main(String[] args) throws FileNotFoundException {

        Scanner inFile = new Scanner(new FileReader("numbers.txt"));
        String inputLine;

        while (inFile.hasNext()) {
            inputLine = inFile.next();
            if (isBinary(inputLine)) {
                System.out.print(inputLine + " is a valid binary number. ");
                baseConvert(inputLine, 2);
            }

            if (isOctal(inputLine)) {
                System.out.print(inputLine + " is a valid octal number. ");
                baseConvert(inputLine, 8);
            }

            if (isDecimal(inputLine)) {
                System.out.print(inputLine + " is a valid decimal number. ");
                baseConvert(inputLine, 10);
            }

            if (isHexadecimal(inputLine)) {
                System.out.print(inputLine + " is a valid hexadecimal number. ");
                baseConvert(inputLine, 16);
            }
            System.out.println();
        }
    }
}
