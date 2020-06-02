import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class KochLine {

    public static void mainDraw(Graphics graphics) {
        drawKoch(900,45,600, 0,graphics);

    }

    private static void drawKoch(double width, int x, int y, double vector, Graphics g) {
        if (width<30) g.drawLine(x,y,x+deltaX(vector,width),y+deltaY(vector,width));
        else {
            double distance = width / 3;

            drawKoch(distance, x, y, vector, g);

            x += deltaX(vector, distance);
            y += deltaY(vector, distance);

            drawKoch(distance, x, y, (vector + Math.PI / 3), g);
            drawKoch(distance, x + deltaX((vector + Math.PI / 3), distance), y + deltaY(vector + Math.PI / 3, distance), (vector - Math.PI / 3), g);

            x += deltaX(vector, distance);
            y += deltaY(vector, distance);

            drawKoch(distance, x, y, vector, g);
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
