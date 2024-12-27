import java.util.Scanner;

public class Project4a {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int div, x;
        int lowerBound, upperBound;

        System.out.print("Enter a whole number divisor: ");
        div = kb.nextInt();

        System.out.print("Enter a lower bound: ");
        lowerBound = kb.nextInt();
        System.out.print("Enter an upper bound: ");
        upperBound = kb.nextInt();

        if (lowerBound <= upperBound) {
            System.out.println("Numbers evenly divisible by " + div + " in the range " +
                    lowerBound + " to " + upperBound + ":");

            for (x = lowerBound; x <= upperBound; x++)
                if (x % div == 0)
                    System.out.print(x + " ");
        } else {
            System.out.println("The lower bound is greater than the upper bound.");
        }
    }
}