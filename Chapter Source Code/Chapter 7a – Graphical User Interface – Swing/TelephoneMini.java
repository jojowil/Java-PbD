import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelephoneMini extends JFrame implements ActionListener {

    String[] kdig = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
    String[] kval = {"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "", "OPER", ""};
    JButton[] keys = new JButton[12];
    JPanel keypad = new JPanel(new GridLayout(4,3));
    JPanel name = new JPanel(new FlowLayout());
    JPanel copy = new JPanel(new FlowLayout());

    public TelephoneMini() {
        int x;

        setTitle("Telephone");
        setResizable(false);
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        add(BorderLayout.NORTH, name);
        name.add(new JLabel("New York Telephone"));

        for (x = 0; x < 12; x++) {
            keys[x] = new JButton();
            setButtonFace(keys[x], kdig[x], kval[x]);
            keypad.add(keys[x]);
        }

        keys[10].addActionListener(this);

        add(BorderLayout.CENTER, keypad);

        add(BorderLayout.SOUTH, copy);
        copy.add(new JLabel("Copyright (c) 2018"));
        setVisible(true);
    }

    private void setButtonFace(JButton b, String  l1, String l2) {
        b.setLayout(new BorderLayout());
        b.add(BorderLayout.CENTER, new JLabel(l1, SwingConstants.CENTER));
        b.add(BorderLayout.SOUTH, new JLabel(l2, SwingConstants.CENTER));
    }

    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {

        TelephoneMini t = new TelephoneMini();

    }
}
