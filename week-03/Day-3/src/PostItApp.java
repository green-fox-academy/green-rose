import java.awt.*;

class PostIt {
    Color backgroundColor;
    String text;
    Color textColor;
}
public class PostItApp {
    public static void main(String[] args) {

    PostIt postIt1 =  new PostIt();
    postIt1.textColor=Color.blue;
    postIt1.text="Idea1";
    postIt1.backgroundColor = Color.orange;
    PostIt postIt2 =  new PostIt();
    postIt2.textColor=Color.black;
    postIt2.text="Awesome";
    postIt2.backgroundColor = Color.pink;
    PostIt postIt3 =  new PostIt();
    postIt3.textColor=Color.green;
    postIt3.text="Superb!";
    postIt3.backgroundColor = Color.yellow;
    Animal ani = new Animal();
        System.out.println(ani.hunger);


    }

}



