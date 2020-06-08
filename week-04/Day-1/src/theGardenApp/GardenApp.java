package theGardenApp;

public class GardenApp {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.addPlant( new Flower("yellow"));
        garden.addPlant( new Flower("blue"));
        garden.addPlant( new Tree("purple"));
        garden.addPlant( new Tree("orange"));

        System.out.println(garden);

        garden.waterMe(40);

        System.out.println(garden);

        garden.waterMe(70);

        System.out.println(garden);
    }
}
