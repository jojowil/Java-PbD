import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class Border extends JFrame {
    private JButton nb, sb, eb, wb, cb;

    public Border() {
        setLayout(new BorderLayout());

        nb = new JButton("North Button");
        sb = new JButton("South Button");
        eb = new JButton("East Button");
        wb = new JButton("West Button");
        cb = new JButton("Center Buton");

        add(nb, BorderLayout.NORTH);
        add(sb, BorderLayout.SOUTH);
        add(eb, BorderLayout.EAST);
        add(wb, BorderLayout.WEST);
        add(cb, BorderLayout.CENTER);

        setTitle("BorderLayout");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Border win = new Border();
    }
}
