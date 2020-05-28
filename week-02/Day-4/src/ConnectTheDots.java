import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        int[][][] dotsArray = {{{10, 10}, {290,  10}, {290, 290}, {10, 290}},{{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
            {120, 100}, {85, 130}, {50, 100}}};
        for (int[][] dots: dotsArray
             ) {
            int x=dots[dots.length-1][0];
            int y=dots[dots.length-1][1];
            for (int i = 0; i < dots.length; i++) {
               graphics.drawLine(x,y,dots[i][0],dots[i][1]);
                x=dots[i][0];
                y=dots[i][1];
            }
            graphics.setColor(Color.BLUE);
        }
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
