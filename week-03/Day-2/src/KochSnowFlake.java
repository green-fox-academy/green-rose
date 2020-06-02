import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochSnowFlake {

    public static void mainDraw(Graphics graphics) {
        int x=45;
        int y=600;
        int width = 600;
        double[] angles ={Math.PI/3,-Math.PI/3,Math.PI};
        for (double angle: angles) {
            drawKoch(width,x,y, angle ,graphics);
            x += deltaX(angle, width);
            y += deltaY(angle, width);
        }
    }

    private static void drawKoch(double width, int x, int y, double vector, Graphics g) {
        if (width<5) g.drawLine(x,y,x+deltaX(vector,width),y+deltaY(vector,width));
        else {
            double distance = width / 3;
            double[] angles ={0,Math.PI/3,-Math.PI/3,0};
            for (double angle: angles) {
                drawKoch(distance,x,y, vector+angle ,g);
                x += deltaX(vector+angle, distance);
                y += deltaY(vector+angle, distance);
            }
        }
    }
    private static int deltaY(double angle, double distance){
        return (int) Math.round(-1*distance*Math.sin(angle));
    }
    private static int deltaX(double angle, double distance){
        return (int) Math.round(distance*Math.cos(angle));
    }


    // Don't touch the code below
    static int WIDTH = 990;
    static int HEIGHT = 990;


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
