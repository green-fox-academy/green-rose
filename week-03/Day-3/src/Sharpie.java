
public class Sharpie {
        String color;
        float width;
        float inkAmount;

    /*public Sharpie(){
        this(null,0.0f,100.0f);
    }*/

    public Sharpie(String color, float width) {
        this.color=color;
        this.width=width;
        this.inkAmount=100.0f;
    }


    public void use(){
        this.inkAmount--;
    }
}

