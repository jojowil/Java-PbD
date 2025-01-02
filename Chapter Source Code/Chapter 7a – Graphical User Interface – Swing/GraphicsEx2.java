import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsEx2 extends JFrame {

    //PaintCanvas p;

    public GraphicsEx2() {
        //p = new PaintCanvas();
        add(new PaintCanvas());

        setResizable(false);
        setSize(400, 300);
        setTitle("GraphicsEx2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private class PaintCanvas extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.BLACK);

            g.setColor(Color.WHITE);

            // main ship body
            g.drawLine(150,100,180,110);
            g.drawLine(150,120,180,111);
            g.drawLine(158,103,158,117);

            // jet boost
            g.drawLine(153,107,145,110);
            g.drawLine(153,113,145,111);

            // asteroid 1
            int[] poly1x = {280, 280, 300, 290, 320, 350, 350, 370, 360, 360, 330, 300};
            int[] poly1y = {90, 130, 130, 150, 160, 160, 140, 120, 100, 90, 70, 70};
            g.drawPolygon(poly1x, poly1y, poly1x.length);

            // asteroid 2
            int[] poly2x = {90, 90, 100, 120, 123, 130, 120, 130, 132, 120, 103, 110};
            int[] poly2y = {160, 173, 186, 177, 180, 176, 167, 163, 156, 150, 150, 160};
            g.drawPolygon(poly2x, poly2y, poly2x.length);
        }
    }

    public static void main(String[] args) {
        // Start the show!
        GraphicsEx2 w = new GraphicsEx2();
    }

}
