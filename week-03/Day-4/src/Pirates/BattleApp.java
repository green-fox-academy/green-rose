package Pirates;

public class BattleApp {
    public static void main(String[] args) {

        Ship black = new Ship("Black Pearl");
        black.setCaptain("John Long Silver");
        black.fillShip();
        Ship white = new Ship("White Pearl");
        white.setCaptain("Jack One Eye");
        white.fillShip();

        System.out.println(black);
        System.out.println(white);

        if (black.battle(white)) System.out.println("Blacks!!!");
        else System.out.println("Whites!!!");

        System.out.println(black);
        System.out.println(white);
    }
}
