import java.util.Scanner;

public class Guess {

    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {

        int randomNumber, guess;
        boolean found;

        // random number between 1 and 20
        randomNumber = (int)(Math.random() * 20 + 1);

        System.out.println("I'm thinking of a number between 1 and 20.");

        found = false;
        // while not found, guess forever.
        while ( ! found ) {
            System.out.print("Guess the value between 1 and 20: ");
            guess = kb.nextInt();

            if ( guess == randomNumber )
                found = true;
            else
                System.out.println("It's not " + guess + ".\n");
        }

        System.out.println("\nYou got it!\n");
    }
}
