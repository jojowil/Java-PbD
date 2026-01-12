import java.util.Scanner;

public class NumType {

    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        int x;

        System.out.print("Enter an integer: ");
        x = kb.nextInt();

        System.out.print("The value " + x + " is ");
        // multi-way if test with "else if".
        if ( x < 0 )
            System.out.println("Negative.");
        else if ( x > 0 )
            System.out.println("Positive.");
        else
            System.out.println("Zero.");
    }
}
