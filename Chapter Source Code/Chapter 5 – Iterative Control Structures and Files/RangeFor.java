import java.util.Scanner;

public class RangeFor {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        int sum = 0;
        int x, value;
        double avg;

        for ( x = 1; x <= 3; x++ ) {
            System.out.print("Enter value #" + x + ": ");
            value = kb.nextInt();
            sum = sum + value;
        }

        avg = sum / 3.0;

        System.out.println("The sum is " + sum + ".");
        System.out.println("The average is " + avg + ".");
    }
}
