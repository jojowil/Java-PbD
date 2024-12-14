import java.util.Scanner;

public class Methods {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        double x, y, square;

        System.out.println("\nThis program uses pow to demonstrate");
        System.out.println("static methods. It will also find");
        System.out.println("the min and max of the two values");
        System.out.println("you have entered.\n");

        // alternate prompting and reading values
        System.out.print("Enter a value for x: ");
        x = kb.nextDouble();

        System.out.print("Enter a value for y: ");
        y = kb.nextDouble();

        // print findings using some Math class methods.
        System.out.println("The value of x raised to the y is " + Math.pow(x,y));
        System.out.println("The min value is " + Math.min(x,y));
        System.out.println("The max value is " + Math.max(x,y));
    }
}
