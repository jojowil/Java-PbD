import javax.swing.JFrame;

public class Window1 {
    public static void main(String[] args) {
        JFrame win = new JFrame("New Window");
        win.setSize(300,200);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
