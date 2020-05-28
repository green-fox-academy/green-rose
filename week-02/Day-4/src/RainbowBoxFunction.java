import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        Random random = new Random();
        Color indigo = new Color(75,0,130);
        Color violet = new Color(238,130,238);
        Color colors[] = {Color.GREEN, Color.YELLOW, Color.ORANGE, Color.BLUE, indigo, violet};
        for (int i = 0; i < 30; i++) {
            Color color =colors[random.nextInt(colors.length)];

            int width = (int) (Math.random()*HEIGHT);

            drawRect(width,color,graphics);

        }
    }

    public static void drawRect(int width, Color color, Graphics graphics){
        // Draw a box that has different colored lines on each edge.

        graphics.setColor(color);
        graphics.drawRect(WIDTH/2-width/2,HEIGHT/2-width/2,width,width);
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
