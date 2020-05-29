import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        int step = 20;
        Color indigo = new Color(75,0,130);
        int margin = 5;
        for (int i = step+margin; i < WIDTH-step-margin; i+=step) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(margin,i,i,WIDTH-margin);
            graphics.setColor(indigo);
            graphics.drawLine(i,margin,WIDTH-margin,i);

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
