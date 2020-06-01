import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
    public static void mainDraw(Graphics graphics) {
        int parts = 3;
        draw2Lines(WIDTH,parts,0,0, graphics);

    }

    private static void drawLines(int width, int parts, int X, int Y, Graphics g) {

        for (int i = 0; i < parts; i++) {
            for (int j = 0; j < parts; j++) {
                g.drawRect(X + (i * width/parts), Y + (j * width/parts), width/parts, width/parts);
                if ((i + j) % 2 == 1) {
                    if (width/parts>10){
                        drawLines(width/parts, parts, X + (i * width/parts), Y + (j * width/parts), g);

                    }
                }
            }

        }
    }

    private static void draw2Lines(int width, int parts, int X, int Y, Graphics g) {

        for (int i = 0; i < parts; i++) {
            if (i>0){
                g.drawLine(X + i*(width/parts),Y,X + i*(width/parts) ,Y+width);
                g.drawLine(X,Y+ i*(width/parts),X+width ,Y+ i*(width/parts));
            }
            for (int j = 0; j < parts; j++) {
                if ((i + j) % 2 == 1) {
                    if (width / parts > 1) {
                        draw2Lines(width / parts, parts, X + (i * width / parts), Y + (j * width / parts), g);

                    }
                }
            }

        }
    }


    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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
