import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TreeFractal {
    static int MAX_IT = 8;

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(0,0,WIDTH, HEIGHT);
        graphics.setColor(Color.orange);
        int x=WIDTH/2;
        int y=WIDTH-20;
        double width = 35;
        double angle = Math.PI/2;
        int xEnd = x+deltaX(angle,width);
        int yEnd = y+deltaY(angle,width);
        graphics.drawLine(x,y,xEnd,yEnd);
        drawTree(width,xEnd,yEnd,angle,graphics,0);
    }

    private static void drawTree(double width, int x, int y, double vector, Graphics g,int it) {
        if (it>=MAX_IT) return;
        else {
            ++it;
            g.drawLine(x,y,x+deltaX(vector,width),y+deltaY(vector,width));
            drawTree(width,x+deltaX(vector,width),y+deltaY(vector,width),vector,g,it);
            g.drawLine(x,y,x+deltaX(vector-Math.PI/8,width*.8),y+deltaY(vector-Math.PI/8,width*.8));
            drawTree(width,x+deltaX(vector-Math.PI/8,width*.8),y+deltaY(vector-Math.PI/8,width*.8),vector-Math.PI/8,g,it);
            g.drawLine(x,y,x+deltaX(vector+Math.PI/8,width*.8),y+deltaY(vector+Math.PI/8,width*.8));
            drawTree(width,x+deltaX(vector+Math.PI/8,width*.8),y+deltaY(vector+Math.PI/8,width*.8),vector+Math.PI/8,g,it);
        }
    }
    private static int deltaY(double angle, double distance){
        return (int) Math.round(-1*distance*Math.sin(angle));
    }
    private static int deltaX(double angle, double distance){
        return (int) Math.round(distance*Math.cos(angle));
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
