import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {

    public static void mainDraw(Graphics graphics) {
        drawHexagon(WIDTH,WIDTH/2,HEIGHT/2, graphics);

    }

    private static void drawHexagon(int width, int X, int Y, Graphics g) {
        //draw hexagon;
        int a = width / 2;
        int v = (int) (a * Math.sqrt(3) / 2);
        drawHex(X, Y, a, v, g);

        width=width/3;
        a = width / 2;

        int[] x = {X - a, X+a, X - 2*a,X + 2*a, X - a, X+a};
        int[] y = {Y - 2 * v / 3, Y - 2 * v / 3, Y , Y, Y + 2 * v / 3, Y + 2 * v / 3};
        if (a>1){
            for (int i = 0; i < 6; i++) {
                drawHexagon(width,x[i],y[i],g);
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
    static int WIDTH = 330;
    static int HEIGHT = 330;

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
