import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JLabel ul = new JLabel("Username:");
    JLabel pl = new JLabel("Password:");
    JTextField uname = new JTextField();
    JPasswordField upass = new JPasswordField();

    JButton cancel = new JButton("Cancel");
    JButton login = new JButton("Login");

    JMenuBar mb = new JMenuBar();
    JMenu m = new JMenu("Options");
    JMenuItem help = new JMenuItem("Help");

    public Login() {
        setLayout(null);
        setResizable(false);
        setSize(400, 250);
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        mb.add(m);
        help.addActionListener(this);
        m.add(help);
        setJMenuBar(mb);

        ul.setBounds(100,50,100, 25);
        pl.setBounds(100,100,100, 25);
        uname.setBounds(200,50,100, 25);
        upass.setBounds(200,100,100, 25);
        cancel.setBounds(100,150,100, 25);
        login.setBounds(200,150,100, 25);

        add(ul);
        add(pl);
        add(uname);
        add(upass);
        cancel.addActionListener(this);
        add(cancel);
        login.addActionListener(this);
        add(login);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        Object s = e.getSource();

        if (s == cancel)
            System.exit(1);
        else if (s == login) {
            JOptionPane.showMessageDialog(null,"Login performed!",
                    "Login", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        else if (s == help)
            JOptionPane.showMessageDialog(null,"Help goes here!",
                    "Help", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Login l = new Login();
    }
}
