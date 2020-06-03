package Sharpies;

public class SharpieApp {
    public static void main(String[] args) {
        SharpieSet sharpies = new SharpieSet();
        sharpies.listSharpie.add(new Sharpie("blue", 100));
        sharpies.listSharpie.add(new Sharpie("black", 102));
        sharpies.listSharpie.add(new Sharpie("black", 104));
        sharpies.listSharpie.get(1).use(100);

    }
}