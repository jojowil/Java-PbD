import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        final double PI = 3.1415926;
        int diameter, height;
        double radius;
        double circumference, areaOfCircle, cylVolume;
        String name;

        System.out.print("Enter your name: ");
        name = kb.nextLine();

        System.out.println("Hello, " + name +
                ". You have two more answers to provide.");

        System.out.print("Enter the diameter of a cylinder: ");
        diameter = kb.nextInt();
        radius = diameter / 2.0;

        System.out.print("Enter the height of the cylinder: ");
        height = kb.nextInt();

        circumference = diameter * PI;
        areaOfCircle = PI* Math.pow(radius, 2);
        cylVolume = areaOfCircle * height;

        System.out.println("The radius is " + radius + ".");
        System.out.println("The diameter is " + diameter + ".");
        System.out.println("The height is " + height + ".");
        System.out.println("The circumference is " + circumference + ".");
        System.out.println("The area of the base is " + areaOfCircle + ".");
        System.out.println("The volume of the cylinder is " + cylVolume + ".");
    }
}
