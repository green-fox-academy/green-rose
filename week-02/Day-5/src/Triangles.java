import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        int x=WIDTH/2;
        int y=0;
        int a=20;
        int maxHeight = (int) (WIDTH*Math.sqrt(3)/2);
        int v = (int) (a*Math.sqrt(3)/2);

        drawTriangle(x,y,a,v,maxHeight,graphics);
    }

    private static void drawTriangle(int x, int y, int a, int v, int maxHeight ,Graphics g) {

        int[] xPoints = {x, x - (a / 2), x + (a / 2)};
        int[] yPoints = {y, y + v, y + v};
        int nPoints = 3;

        if (y + v < maxHeight && x - (a / 2) >= 0 && x - (a / 2) <= WIDTH) {
            g.drawPolygon(xPoints, yPoints, nPoints);
            drawTriangle(x - (a / 2), y + v, a, v, maxHeight, g);
            drawTriangle(x + (a / 2), y + v, a, v, maxHeight, g);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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
