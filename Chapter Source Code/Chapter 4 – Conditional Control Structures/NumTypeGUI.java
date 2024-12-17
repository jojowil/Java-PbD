import javax.swing.JOptionPane;

public class NumTypeGUI {

    public static void main(String[] args) {

        int x;
        String s;
        s = JOptionPane.showInputDialog("Enter an integer:");
        x = Integer.parseInt(s);

        s = "The number " + x + " is ";
        // multi-way if test with "else if".
        if ( x < 0 )
            s = s + "Negative.";
        else if ( x > 0 )
            s = s + "Positive.";
        else
            s = s + "Zero.";

        JOptionPane.showMessageDialog(null, s, "Results",
                JOptionPane.PLAIN_MESSAGE);
    }
}
