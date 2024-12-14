import javax.swing.JOptionPane;

public class Perimeter {

    public static void main(String[] args) {

        String input, output;
        double length, width, perimeter;

        // prompt and read length.
        input = JOptionPane.showInputDialog("Length of box:");
        // String needs to be converted to double.
        length = Double.parseDouble(input);

        // repeat for width
        input = JOptionPane.showInputDialog("Width of box");
        width = Double.parseDouble(input);

        // calculation!
        perimeter = 2 * length + 2 * width;

        // build the output as a big String. Note how we cross line
        // boundaries for readability.
        output = String.format("For the box with length %.2f%n", length)
                + String.format("and width %.2f%n", width)
                + String.format("the perimeter is %.2f%n", perimeter);

        // again, crossing line boundaries so we can see each argument passed
        JOptionPane.showMessageDialog(null,
                output,
                "Perimeter of the box.",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
