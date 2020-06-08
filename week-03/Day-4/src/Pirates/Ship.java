package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    public String shipName;
    public Pirate captain;
    public List<Pirate> crew = new ArrayList<>();


    public Ship(String shipName){
        this.shipName=shipName;
    }

    public void setCaptain (String captainName) {
        this.captain = new Pirate(captainName);
    }

    public void fillShip(){
        for (int i = 0; i < (Math.random()*5)+10; i++) {
            crew.add(new Pirate());
        }
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
        while (i<lostLives) {
            while (this.crew.get(j).died || this.crew.get(j).sleeping) j++;
            this.crew.get(j).die();
            i++;
        }
    }

    public void battleWon(){
        System.out.println(this.shipName+" won this round!");
        for (int i = 0; i < (int) Math.round(Math.random()*5); i++) {
            this.captain.drinkSomeRum();
        }
        for (Pirate pirate: this.crew) {
            for (int i = 0; i < (int) Math.round(Math.random()*5); i++) {
                System.out.print(pirate.name+": ");
                pirate.drinkSomeRum();
            }
        }
    }

    public boolean battle (Ship otherShip){
        int score = this.getNumberOfPirates()+this.captain.getRumInBlood();
        int enemy = otherShip.getNumberOfPirates()+otherShip.captain.getRumInBlood();
        if (score>=enemy){
           otherShip.battleLost();
           this.battleWon();
        } else {
            this.battleLost();
            otherShip.battleWon();
        }
        if (this.getNumberOfPirates()<=0) return false;
        else  if (otherShip.getNumberOfPirates()<=0) return true;
        else return this.battle(otherShip);
    }

    @Override
    public String toString() {
        return
                "Ship '" + shipName + "'\n" +
                        "Captain " + captain +"\n" +
                        "Crew: " + crew;
    }

}
