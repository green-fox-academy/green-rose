import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleByPeter {

    static int MAX_LEVEL=5;

    public static void mainDraw(Graphics graphics)  {

        drawTriangle(300,300,0, graphics, 0);

    }

    private static void drawTriangle(int v, int X, int Y, Graphics g, int level) {

        if(v<=10) return;

        int width = (int) (v/Math.sqrt(3));

        drawTri(X, Y,width, v, g);
        drawTriangle(v/2, X+width, Y, g, level++);
        drawTriangle(v/2, X-width, Y, g, level++);
        drawTriangle(v/2, X, Y+v, g, level++);

    }
    private static void drawTri(int x, int y, int a, int v,Graphics g) {

        int[] xPoints = {x, x +a, x - a};
        int[] yPoints = {y, y+v , y + v};
        int nPoints = 3;
        //Thread.sleep(10);
        g.drawPolygon(xPoints, yPoints, nPoints);

    }


    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
