import java.util.Scanner;

public class EOFWhile {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        String line;

        // prompt here to prep for the loop.
        System.out.print("Enter a string (CTRL-D to end): ");

        // hasNext() pauses here waiting to see if there's input
        while ( kb.hasNext() ) {
            line = kb.nextLine();  // read the line
            System.out.println("Input was " + line.length() + " characters long.");
            // prompt again as we return to the top.
            System.out.print("Enter a string (CTRL-D to end): ");
        }
    }
}
