package Pirates;

public class Pirate {
    static Integer noPirate;
    private int rumInBlood = 0;
    private boolean sleeping = false;
    private boolean died = false;
    public String name;

    public Pirate(){
        this.name = "Pirate"+noPirate;
    }
    public Pirate(String name){
        this.name=name;
    }
    public String drinkSomeRum(){
        if (this.sleeping) return "I'am sleeping, wake me with rum!";
        if (this.died) return "Ouch, I've died!";
        this.rumInBlood++;
        return "Thanks.";


    }
    public String howsItGoingMate(){
        if (this.sleeping) return "I'am sleeping, wake me with rum!";
        if (this.died) return "Ouch, I've died!";
        if (this.rumInBlood <5){
            rumInBlood++;
            return "Pour me anidder!";
        } else{
            this.sleeping =true;
            rumInBlood=0;
        }
        return "Pour me anidder!";
    }

    public void die(){
        this.died = true;
    }
    public String brawl(Pirate other){
        if(other.sleeping) return "Wake him first!";
        if (this.sleeping) return "I'am sleeping, wake me with rum!";
        switch ((int) (Math.random()*3)) {
            case 0:
                this.died=true;
                return "Ouch, I've died!";

            case 1:
                other.died=true;
                return "I've just kill that b'stard!";

            case 2:
            default:
                other.sleeping=true;
                this.sleeping=true;
                return "Lets sleep together:-)";

        }
    }

}
