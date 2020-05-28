import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 10; i++) {
            double a=Math.random();
            int x = (int) (Math.random()*WIDTH);
            int y = (int) (Math.random()*HEIGHT);
            drawLineToCenter(x,y,graphics);

        }
    }

    public static void drawLineToCenter(int x, int y, Graphics graphics){
        // Draw a box that has different colored lines on each edge.
        Random random = new Random();
        Color colors[] = {Color.GREEN, Color.YELLOW, Color.ORANGE, Color.BLUE, Color.CYAN};
        graphics.setColor(colors[random.nextInt(colors.length)]);
        graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);
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
