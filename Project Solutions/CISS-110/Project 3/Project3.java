import javax.swing.JOptionPane;

public class Project2 {
    public static void main(String[] args) {
        final double PI = 3.1415926;
        int diameter, height;
        double radius;
        double circumference, areaOfCircle, cylVolume;
        String name, s;

        name = JOptionPane.showInputDialog("Enter your name and select OK.");

        JOptionPane.showMessageDialog(null,
                "Hello, " + name + ". You have a two more values to provide.",
                "Greetings!",
                JOptionPane.INFORMATION_MESSAGE);

        s = JOptionPane.showInputDialog("Enter the integer diameter of a cylinder.");
        diameter = Integer.parseInt(s);
        radius = diameter / 2.0;

        s = JOptionPane.showInputDialog("Enter the integer height of the cylinder.");
        height = Integer.parseInt(s);

        circumference = diameter * PI;
        areaOfCircle = PI * Math.pow(radius, 2);
        cylVolume = areaOfCircle * height;

        JOptionPane.showMessageDialog(null,
                "The radius is " + radius + ".\n" +
                        "The diameter is " + diameter + ".\n" +
                        "The height is " + height + ".\n" +
                        "The circumference is " + circumference + ".\n" +
                        "The area of the base is " + areaOfCircle + ".\n" +
                        "The volume of the cylinder is " + cylVolume + ".\n",
                "Results",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
