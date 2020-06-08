package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    public List<Aircraft> aircrafts;
    public Integer ammo;
    private Integer healthPoints;

    Carrier(Integer ammo, Integer healthPoints){
        this.ammo=ammo;
        this.healthPoints = healthPoints;
        this.aircrafts = new ArrayList<>();
    }

    public void add(Aircraft aircraft){
        this.aircrafts.add(aircraft);
    }

    public void fill() throws Exception {
        if (this.ammo<=0) throw new Exception("No ammo!!!");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < this.aircrafts.size(); j++) {
                if (this.aircrafts.get(j).isPriority()==(i==0)){
                    this.ammo = this.aircrafts.get(j).refill(ammo);
                    if (ammo<=0) throw new Exception("No ammo!!!");
                }
            }
        }
        return;
    }

    public void fight(Carrier otherCarrier){
        int damage = 0;
        for (Aircraft aircraft: aircrafts) {
            damage+=aircraft.fight();
        }
        otherCarrier.healthPoints=(otherCarrier.healthPoints>=damage)?otherCarrier.healthPoints-damage:0;
    }

    public String getStatus(){
        if (this.healthPoints<=0) return "Itś dead Jím :(";
        Integer totalDamage = 0;
        String status = "";
        for (Aircraft aircraft: aircrafts) {
            totalDamage+=(aircraft.ammunition*aircraft.baseDamage);
            status+=aircraft.getStatus()+"\n";
        }
        return "HP: " + healthPoints +
                ", Aircraft count: "+ aircrafts.size() +
                ", Ammo Storage: " + this.ammo +
                ", Total Damage: " + totalDamage+"\nAircrafts: \n" + status;
    }

}
