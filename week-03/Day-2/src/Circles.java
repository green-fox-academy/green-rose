import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

    public static void mainDraw(Graphics graphics) {
        try {
            drawCircles(WIDTH/2,WIDTH/2,WIDTH/2, graphics);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void drawCircles(int r, int x, int Y, Graphics g) throws InterruptedException {
        //draw hexagon;

        g.drawOval(x-r,Y-r,r*2,r*2);

        r=r/2;

        int[] xArrays = {x, (int) (x-r*(Math.cos(Math.PI/6))), (int) (x+r*(Math.cos(Math.PI/6)))};
        int[] yArrays = {Y-r,(int) (Y+r*(Math.sin(Math.PI/6))),(int) (Y+r*(Math.sin(Math.PI/6)))};

        if (r>5){
            for (int i = 0; i < 3; i++) {
                drawCircles(r,xArrays[i],yArrays[i],g);
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
