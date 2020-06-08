package AircraftCarrier;

import java.security.PublicKey;

public abstract class Aircraft {
    Integer maxAmmo;
    Integer baseDamage;
    Integer ammunition;
    String type;

    Aircraft() {
        this.ammunition=0;
    }

    public Integer fight(){
        Integer damage = this.ammunition*this.baseDamage;
        this.ammunition=0;
        return damage;
    }

    public Integer refill(Integer fill){
        Integer demand = this.maxAmmo-this.ammunition;
        if (fill >= demand) {
            this.ammunition+=demand;
            fill-=demand;
        } else {
            this.ammunition+=fill;
            fill=0;
        }
        return fill;
    }
    public String getType(){
        return this.type;
    }

    public String getStatus(){
        return "Type "+this.getType()+" Ammo: "+this.ammunition+" Base Damage: "
                +this.baseDamage+" All Damage: "+this.ammunition*this.baseDamage;
    }

    abstract boolean isPriority();

}
