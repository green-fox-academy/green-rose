import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        Random random = new Random();
        Color colors[] = {Color.GREEN, Color.YELLOW, Color.ORANGE, Color.BLUE, Color.CYAN};
        graphics.setColor(colors[random.nextInt(colors.length)]);
        graphics.fillRect(WIDTH/2-5,HEIGHT/2-5,10,10);


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
