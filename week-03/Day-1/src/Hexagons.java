import javax.swing.*;
import java.awt.*;
import java.awt.image.AffineTransformOp;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagons {
    public static void mainDraw(Graphics graphics) {
        drawHexagon(WIDTH,WIDTH/2,HEIGHT/2, graphics);

    }

    private static void drawHexagon(int width, int X, int Y, Graphics g) {
        //draw hexagon;
        int a = width / 2;
        int v = (int) (a * Math.sqrt(3) / 2);
        drawHex(X, Y, a, v, g);
        int[] x = {X - a / 4, X+a/2, X - a/ 4};
        int[] y = {Y - v / 2, Y, Y + v / 2};
        if (a>10){
            for (int i = 0; i < 3; i++) {
                drawHexagon(a,x[i],y[i],g);
            }
        }
        return;

    }
    private static void drawHex(int x, int y, int a, int v, Graphics g) {

        int[] xPoints = {x + a, x + (a/2), x - (a/2), x - a, x - (a/2), x + (a/2)};
        int[] yPoints = {y, y - v, y - v, y, y+v,y+v};
        int nPoints = 6;
        g.drawPolygon(xPoints, yPoints, nPoints);

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
