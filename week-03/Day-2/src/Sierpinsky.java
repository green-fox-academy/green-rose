import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Sierpinsky {

    public static void mainDraw(Graphics graphics) {
        drawBoxes(WIDTH,0,0, graphics);

    }

    private static void drawBoxes(int width, int x, int y, Graphics g) {
        width = width/3;
        if (width<1) return;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1)
                    g.fillRect(x + i * width, y + j * width, width, width);
                else drawBoxes(width, x + i * width, y + j * width, g);
            }
        }
    }



    // Don't touch the code below
    static int WIDTH = 333;
    static int HEIGHT = 333;

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
