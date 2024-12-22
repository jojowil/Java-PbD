import java.util.Scanner;

public class BetterGuess {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        int randomNumber, guess, guessLimit=5;
        boolean found;

        // random number between 1 and 20
        randomNumber = (int)(Math.random() * 20 + 1);

        System.out.println("I'm thinking of a number between 1 and 20.");

        found = false;
        // while not found, guess within limit.
        while ( ! found && guessLimit > 0 ) {
            System.out.println("You have " + guessLimit + " guesses remaining.");
            System.out.print("Guess the value between 1 and 20: ");
            guess = kb.nextInt();
            guessLimit--;

            if ( guess == randomNumber )
                found = true;
            else
                System.out.println("It's not " + guess +".\n");
        }

        if ( found )
            System.out.println("\nYou got it!\n");
        else
            System.out.println("\nThe number was " + randomNumber + ".\n");
    }
}
