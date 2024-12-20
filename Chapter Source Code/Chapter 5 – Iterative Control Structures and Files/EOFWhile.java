import java.util.Scanner;

public class EOFWhile {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        String line;

        System.out.print("Enter a string (CTRL-D to end): ");
        while ( kb.hasNext() ) {
            line = kb.nextLine();  // read the line
            System.out.println("Input was " + line.length() + " characters long.");
            System.out.print("Enter a string (CTRL-D to end): ");
        }
    }
}
