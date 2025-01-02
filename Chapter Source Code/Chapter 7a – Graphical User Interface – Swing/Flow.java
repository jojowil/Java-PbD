import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class Flow extends JFrame {
    private JButton b1, b2, b3;
    private JLabel l1;
    private JTextField tf1;

    public Flow() {
        setLayout(new FlowLayout());

        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        l1 = new JLabel("Label 1");
        tf1 = new JTextField("Text Field 1 ­- 30 Columns", 30);

        add(l1);
        add(tf1);
        add(b1);
        add(b2);
        add(b3);

        setTitle("FlowLayout");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Flow win = new Flow();
    }
}
