import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        int howManyParts =16;

        Color indigo = new Color(75,0,130);

        int step = 10;
        int margin = 0;
        int width= (int) (WIDTH/(Math.sqrt(howManyParts)));


        for (int startAtY = 0; startAtY < HEIGHT; startAtY+=width) {
            for (int startAtX= 0; startAtX < WIDTH; startAtX+=width) {
                for (int i = step+margin; i < width-step-margin; i+=step) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine(margin+startAtX,i+startAtY,i+startAtX,width-margin+startAtY);
                    graphics.setColor(indigo);
                    graphics.drawLine(i+startAtX,margin+startAtY,width-margin+startAtX,i+startAtY);

                }
            }
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
