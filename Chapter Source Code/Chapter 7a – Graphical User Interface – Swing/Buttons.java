import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buttons extends JFrame implements ActionListener {

    JButton b = new JButton("Button");
    JRadioButton rb = new JRadioButton("RadioButton");
    JToggleButton tb = new JToggleButton("ToggleButton");
    JCheckBox cb = new JCheckBox("Checkbox");

    public Buttons() {

        setLayout(new GridLayout(4,1));
        setTitle("Buttons");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(150,200);

        b.addActionListener(this);
        add(b);
        rb.addActionListener(this);
        add(rb);
        tb.addActionListener(this);
        add(tb);
        cb.addActionListener(this);
        add(cb);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        Object s = e.getSource();
        if (s == b)
            JOptionPane.showMessageDialog(null,"Button was pressed", "Pressed",
                    JOptionPane.INFORMATION_MESSAGE);
        else if (s == rb)
            JOptionPane.showMessageDialog(null,"Radio button isSelected() state is " +
                            rb.isSelected(), "Pressed",
                    JOptionPane.INFORMATION_MESSAGE);
        else if (s == tb)
            JOptionPane.showMessageDialog(null,"Toggle button isSelected() state is " +
                            tb.isSelected(), "Pressed",
                    JOptionPane.INFORMATION_MESSAGE);
        else if (s == cb)
            JOptionPane.showMessageDialog(null,"Check box isSelected() state is " +
                            cb.isSelected(), "Pressed",
                    JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Buttons b = new Buttons();
    }
}
