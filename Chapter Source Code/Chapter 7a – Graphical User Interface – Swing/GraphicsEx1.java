import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsEx1 extends JFrame {

    PaintCanvas p;

    public GraphicsEx1() {
        p = new PaintCanvas();
        add(p);

        setResizable(false);
        setSize(400, 400);
        setTitle("GraphicsEx1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private class PaintCanvas extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.LIGHT_GRAY);

            g.setColor(Color.BLACK);
            g.drawLine(10,20,100,40);
            g.drawLine(390,20,290,40);

            g.setColor(Color.RED);
            g.drawRect(100, 100, 50, 50);
            g.drawOval(250, 100, 50, 50);

            g.setColor(Color.YELLOW);
            g.drawOval(100, 160, 50, 50);
            g.drawRoundRect(250, 160, 50, 50, 10, 10);

            g.setColor(Color.BLACK);
            g.fillRect(100, 220, 50, 50);
            g.fillOval(250, 220, 50, 50);

            g.setColor(Color.BLUE);
            g.fillOval(100, 280, 50, 50);
            g.fillRoundRect(250, 280, 50, 50, 10, 10);

        }
    }

    public static void main(String[] args) {
        // Start the show!
        GraphicsEx1 w = new GraphicsEx1();
    }

}
