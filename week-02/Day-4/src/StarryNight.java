import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0,WIDTH,HEIGHT);

        for (int i = 0; i < 100; i++) {

            int x = (int) (Math.random()*WIDTH);
            int y = (int) (Math.random()*HEIGHT);
            int width = 2;

            filledRectangle(x,y,width,graphics);

        }
    }

    public static void filledRectangle(int x, int y, int width, Graphics graphics){

        Random random = new Random();
        Color colors[] = {Color.WHITE, Color.GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.DARK_GRAY, Color.WHITE,Color.WHITE,};
        graphics.setColor(colors[random.nextInt(colors.length)]);
        graphics.fillRect(x,y,width,width);
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
