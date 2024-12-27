import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Project6a {

    public static boolean isPunct(String token) {
        return Pattern.matches("\\p{Punct}", token);
    }

    public static boolean isInt(String token) {
        return Pattern.matches("\\d+", token);
    }

    public static boolean isDouble(String token) {
        return Pattern.matches("\\d+\\.\\d+", token);
    }

    public static boolean isIdentifier(String token) {
        return Pattern.matches("[a-zA-Z]+[0-9a-z_]*", token);
    }

    public static boolean isReserved(String token) {
        return Pattern.matches("int|double|long|if|else|void|while|for|return", token);
    }

    public static void classify(String token) {

        if (isPunct(token)) {
            System.out.println("PUNCT " + token);
        } else if (isReserved(token)) {
            System.out.println("RESERVED " + token);
        } else if (isInt(token)) {
            System.out.println("INTCONST " + token);
        } else if (isDouble(token)) {
            System.out.println("DBLCONST " + token);
        } else if (isIdentifier(token)) {
            System.out.println("IDENT " + token);
        } else {
            System.out.println("UNKNOWN " + token);
        }
    }

    public static void main(String[] args) throws FileNotFoundException{

        Scanner inFile = new Scanner(new FileReader("input.txt"));
        String t;

        while (inFile.hasNext()) {
            t = inFile.next();
            classify(t);
        }
    }
}