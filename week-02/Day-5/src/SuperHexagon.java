import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        int a = 20;
        int v = (int) (a*Math.sqrt(3)/2);
        int columns = 9; //should be odd

        for (int i = 0; i < columns; i++) {
           int x = a + i*(a+a/2);
           int rows = columns-Math.abs(i-columns/2);
           for (int j = 0; j<rows;j++){
               int y = HEIGHT/2 - (rows-1)*v + j*2*v;
               drawHexagon(x,y,a,v,graphics);
           }

        }

    }

    private static void drawHexagon(int x, int y, int a, int v, Graphics g) {

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
