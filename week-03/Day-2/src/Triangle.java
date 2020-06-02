import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {

    public static void mainDraw(Graphics graphics)  {
        try {
            drawTriangle(WIDTH,0,0, graphics);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void drawTriangle(int width, int X, int Y, Graphics g) throws InterruptedException {

        int v = (int) (width*Math.sqrt(3)/2);

        drawTri(X, Y,width, v, g);
        int[] x = {X, X + (width / 2), X+(width/4)};
        int[] y = {Y, Y, Y + v / 2};
        if (width>5){
            for (int i = 0; i < 3; i++) {
                drawTriangle(width/2,x[i],y[i],g);
            }
        }
    }
    private static void drawTri(int x, int y, int a, int v,Graphics g) throws InterruptedException {

        int[] xPoints = {x, x +a, x + (a / 2)};
        int[] yPoints = {y, y , y + v};
        int nPoints = 3;
        //Thread.sleep(10);
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
