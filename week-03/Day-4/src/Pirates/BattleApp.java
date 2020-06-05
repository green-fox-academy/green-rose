package Pirates;

public class BattleApp {
    public static void main(String[] args) {

        Ship black = new Ship("Black Pearl");
        black.setCaptain("John Long Silver");
        black.fillShip();
        Ship white = new Ship("White Pearl");
        white.setCaptain("Jack One Eye");
        white.fillShip();

        black.crew.get(0).drinkSomeRum();
        black.crew.get(0).drinkSomeRum();
        black.crew.get(0).drinkSomeRum();
        black.crew.get(0).howsItGoingMate();
        black.crew.get(0).drinkSomeRum();
        black.crew.get(0).setParrot(true);
        black.crew.get(0).drinkSomeRum();
        black.crew.get(0).howsItGoingMate();
        black.crew.get(0).howsItGoingMate();
        black.crew.get(1).die();
        black.crew.get(1).brawl(black.crew.get(3));
        black.crew.get(2).setParrot(true);
        black.crew.get(2).brawl(black.crew.get(3));
        black.captain.drinkSomeRum();
        black.captain.drinkSomeRum();
        black.captain.drinkSomeRum();

        System.out.println(black);
        System.out.println(white);

        if (black.battle(white)) System.out.println("Blacks!!!");
        else System.out.println("Whites!!!");

        System.out.println(black);
        System.out.println(white);
    }
}
