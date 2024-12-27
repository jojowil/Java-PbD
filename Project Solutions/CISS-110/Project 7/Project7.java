import java.util.Scanner;

public class Project7 {
    public static Scanner kb = new Scanner(System.in);

    public static int farToCel(int f) {
        return (f -32) * 5 / 9;
    }

    public static int celToFar(int c) {
        return c * 9 / 5 + 32;
    }

    public static void main(String [] args) {
        int	temp;
        char ch;

        do {
            ch = displayMenu();
            if ( ch == 'F' ) {
                System.out.print("Enter the Fahrenheit temperature: ");
                temp = kb.nextInt();
                System.out.println("The Temperature " + temp + " Fahrenheit is " +
                        farToCel(temp) + " Celsius.");
            }
            else if ( ch == 'C' ) {
                System.out.print("Enter the Celsius temperature: ");
                temp = kb.nextInt();
                System.out.println("The Temperature " + temp + " Celsius is " +
                        farToCel(temp) + " Fahrenheit.");
            }
        } while ( ch != 'Q');
    }

    public static char displayMenu() {
        char choice;

        do {
            System.out.println("\nPlease select one of the following:\n");
            System.out.println("\tF - To convert Fahrenheit to Celsius");
            System.out.println("\tC - To convert Celsius to Fahrenheit");
            System.out.println("\n\tQ - To Quit.\n");

            choice = kb.next().toUpperCase().charAt(0);
        } while ( choice != 'F' && choice != 'C' && choice != 'Q');

        return choice;
    }
}
