import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Grid extends JFrame {
    private JLabel l1, l2, l3;
    private JTextField tf1, tf2, tf3;

    // Constructor for grid
    public Grid() {
        setLayout(new GridLayout(3,2));

        l1 = new JLabel("Label 1");
        l2 = new JLabel("Label 2");
        l3 = new JLabel("Label 3");
        tf1 = new JTextField("Text Field 1");
        tf2 = new JTextField("Text Field 2");
        tf3 = new JTextField("Text Field 3");

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);

        setTitle("GridLayout 3x2");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Grid win = new Grid();
    }
}
