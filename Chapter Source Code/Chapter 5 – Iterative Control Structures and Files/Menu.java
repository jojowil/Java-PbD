import java.util.Scanner;

public class Menu {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        char choice;
        boolean valid;

        valid = false;
        do {
            System.out.println("\nPlease select a menu option.\n");

            // show menu choices.
            System.out.println("Choices:");
            System.out.println("\tC) County Maps");
            System.out.println("\tM) Municipalities");
            System.out.println("\tT) Thermal Images");
            System.out.println("\tU) Utilities");
            System.out.println("\n\tQ) Quit");

            // accept choice
            System.out.print("\n\nChoice: ");
            choice = Character.toUpperCase(kb.next().charAt(0));

            // decide what to do with the selection.
            switch (choice) {
                // combined cases.
                case 'C': case 'M': case 'T': case 'U': case 'Q':
                    valid = true;
                    break;
                default:
                    System.out.println("The choice \"" + choice + "\" is not valid.");
                    break;
            }
        } while (!valid);
    }
}
