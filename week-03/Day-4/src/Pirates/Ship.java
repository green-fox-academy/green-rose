package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    public String shipName;
    public List<Pirate> crew = new ArrayList<>();

    public void setCaptain(Pirate captain) {
        this.captain = captain;
    }

    public Pirate captain;

    public void fillShip(){
        for (int i = 0; i < (Math.random()*10)+5; i++) {
            crew.add(new Pirate());
        }
        captain = new Pirate("Long John Silver");
    }
    public Ship(String shipName){
        this.shipName=shipName;
    }

    private int getNumberOfPirates() {
        int i = 0;
        for (Pirate pirate : this.crew) {
            if (!pirate.died && !pirate.sleeping) i++;
        }
        return i;
    }

    public void battleLost(){
        int lostLives =  (int) Math.round(Math.random()*this.getNumberOfPirates());
        int i=0;
        int j=0;
        while (i<=lostLives) {
            while (this.crew.get(j).died) j++;
            this.crew.get(j).die();
            i++;
        }

    }
    public void battleWon(){
        for (int i = 0; i < (int) Math.round(Math.random()*5); i++) {
            this.captain.drinkSomeRum();
        }
        for (Pirate pirate: this.crew) {
            for (int i = 0; i < (int) Math.round(Math.random()*5); i++) {
                pirate.drinkSomeRum();
            }
        }
    }

    @Override
    public String toString() {
        return
                "Ship '" + shipName + "'\n" +
                "Captain " + captain +"\n" +
                "Crew " + crew;
    }

    public boolean battle (Ship otherShip){
        int score = this.getNumberOfPirates()+this.captain.getRumInBlood();
        int enemy = otherShip.getNumberOfPirates()+otherShip.captain.getRumInBlood();
        if (score>=enemy){
           otherShip.battleLost();
           this.battleWon();
            return true;
        } else {
            this.battleLost();
            otherShip.battleWon();
            return false;
        }
    }

    public static void main(String[] args) {

        Ship black = new Ship("Black Pearl");
        black.setCaptain(new Pirate("John Long Silver"));
        black.fillShip();
        Ship white = new Ship("White Pearl");
        black.setCaptain(new Pirate("Jack One Eye"));
        black.fillShip();

        black.crew.get(0).drinkSomeRum();
        black.crew.get(0).drinkSomeRum();
        black.crew.get(0).drinkSomeRum();
        System.out.println(black.crew.get(0).howsItGoingMate());
        black.crew.get(0).drinkSomeRum();
        black.crew.get(0).setParrot(true);
        black.crew.get(0).drinkSomeRum();
        System.out.println(black.crew.get(0).howsItGoingMate());
        System.out.println(black.crew.get(0).howsItGoingMate());
        System.out.println(black.crew.get(1).die());
        System.out.println(black.crew.get(1).brawl(black.crew.get(3)));
        black.crew.get(2).setParrot(true);
        System.out.println(black.crew.get(2).brawl(black.crew.get(3)));
        black.captain.drinkSomeRum();
        System.out.println(black);

        if (black.battle(white)) System.out.println("Blacks!!!");
        else System.out.println("Whites!!!");
        System.out.println(black);
        System.out.println(white);
    }



}
