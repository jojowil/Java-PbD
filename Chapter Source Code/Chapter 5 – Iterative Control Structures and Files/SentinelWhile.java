import java.util.Scanner;

public class SentinelWhile {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        int sum = 0, count = 0;
        int x, value;
        double avg;

        System.out.print("Enter integers (-1 to end): ");
        value = kb.nextInt();    //initialization
        while ( value != -1 ) {  //condition
            sum = sum + value;
            count++;
            System.out.print("Enter integers (-1 to end): ");
            value = kb.nextInt();  //update
        }
        avg = sum / (double)count;

        System.out.println("The sum is " + sum + ".");
        System.out.println("The average is " + avg + ".");
    }
}
