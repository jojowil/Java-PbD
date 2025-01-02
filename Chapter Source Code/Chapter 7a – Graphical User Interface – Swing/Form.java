import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Form extends JFrame {
    private JLabel inputL, displayL;
    private JTextField inputTF, displayTF;
    private JButton resetB, submitB;

    public Form() {
        setLayout(new GridLayout(3,2));

        inputL = new JLabel("Input:");
        displayL = new JLabel("Display:");
        inputTF = new JTextField("");
        displayTF = new JTextField("");
        resetB = new JButton("Reset");
        submitB = new JButton("Submit");

        add(inputL);
        add(inputTF);
        add(displayL);
        add(displayTF);
        displayTF.setEditable(false);
        add(resetB);
        add(submitB);

        setTitle("Input Form GridLayout 3x2");
        setSize(350,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Form win = new Form();
    }
}
