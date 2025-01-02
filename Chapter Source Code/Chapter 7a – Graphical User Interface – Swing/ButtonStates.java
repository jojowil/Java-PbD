import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonStates extends JFrame implements ActionListener {

    JButton b = new JButton("Show states");
    JRadioButton rb = new JRadioButton("RadioButton");
    JToggleButton tb = new JToggleButton("ToggleButton");
    JCheckBox cb = new JCheckBox("Checkbox");

    public ButtonStates() {

        setLayout(new GridLayout(4,1));
        setTitle("ButtonStates");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(150,200);

        b.addActionListener(this);
        add(b);
        add(rb);
        add(tb);
        add(cb);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        JOptionPane.showMessageDialog(null,"Button was pressed\n" +
                        "\nRadio button isSelected() state is " + rb.isSelected() +
                        "\nToggle button isSelected() state is " + tb.isSelected() +
                        "\nCheck box isSelected() state is " + cb.isSelected(),
                "Pressed", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void main(String[] args) {
        ButtonStates b = new ButtonStates();
    }
}
