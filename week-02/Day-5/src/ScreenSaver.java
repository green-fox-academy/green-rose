import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ScreenSaver extends JFrame{
    static Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    static int SIZE = 100;
    static int BORDER_X = SCREEN_SIZE.width - SIZE;
    static int BORDER_Y = SCREEN_SIZE.height = SIZE;
    int x,y,speed, counter;
    boolean movingRight, movingUp;

    public ScreenSaver(int x, int y, int speed, boolean movingRight, boolean movingUp) throws HeadlessException {

        this.x = x;
        this.y = y;
        this.speed = speed;
        this.movingRight = movingRight;
        this.movingUp = movingUp;
        this.counter = 0;
        setUndecorated(true);
        setVisible(true);

        setBounds(this.x,this.y,SIZE,SIZE);
    }

    public void  paint(Graphics graphics){
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0,SIZE,SIZE);
        graphics.setColor(Color.WHITE);
        graphics.drawString(String.valueOf(this.counter),45,55);
    }

    public static void main(String[] args) throws InterruptedException {
        ScreenSaver saver = new ScreenSaver(200,500,10,true,false);
        animate(saver);

    }
    public static void animate(ScreenSaver saver) throws InterruptedException {
        while (true){
            if(saver.x>=BORDER_X){
                saver.movingRight = false;
            }
            if(saver.x<=0){
                saver.movingRight = true;
            }
            if(saver.y>=BORDER_Y){
                saver.movingUp = true;
            }
            if(saver.y<=0){
                saver.movingUp = false;
            }
            if (saver.movingRight){
                saver.x +=saver.speed;
            } else saver.x -=saver.speed;
            if (saver.movingUp){
                saver.y +=saver.speed;
            } else saver.y -=saver.speed;
            Thread.sleep(200);
            saver.setBounds(saver.x,saver.y,SIZE,SIZE);
            saver.repaint();
        }
    }

}