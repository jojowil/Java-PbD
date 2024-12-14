import java.util.Scanner;

public class UserInput {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        int test1, test2, test3;
        double average;

        // altername prompting and reading from the user.
        System.out.print("Enter test 1: ");
        test1 = kb.nextInt();

        System.out.print("Enter test 2: ");
        test2 = kb.nextInt();

        System.out.print("Enter test 3: ");
        test3 = kb.nextInt();

        // calculate and print results.
        average = (test1 + test2 + test3) / 3.0;
        System.out.println("The average is " + average + ".");
    }
}
