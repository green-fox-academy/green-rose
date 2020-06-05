package Pirates;

public class Pirate {
    static Integer noPirate =0;

    public int getRumInBlood() {
        return rumInBlood;
    }

    private int rumInBlood = 0;
    public boolean sleeping = false;
    public boolean died = false;
    public String name;

    public void setParrot(boolean parrot) {
        this.parrot = parrot;
    }

    private boolean parrot = false;

    public Pirate(){
        noPirate++;
        this.name = "Pirate"+noPirate;
    }

    public Pirate(String name){
        this.name=name;
    }

    private void parrotSays(String answer){
        if (this.parrot) System.out.println(answer+" "+answer);
        else System.out.println(answer+" "+answer);
        return;
    }

    public void  drinkSomeRum(){
        if (this.sleeping) {
            this.parrotSays("I'am sleeping, wake me with rum!");
            return;
        }
        if (this.died) {
            this.parrotSays("Ouch, I've died!");
            return;
        }
        this.rumInBlood++;
        this.parrotSays("Thanks.");
        return ;
    }

    public void howsItGoingMate(){
        if (this.sleeping) {
            this.parrotSays("I'am sleeping, wake me with rum!");
            return;
        }
        if (this.died) {
            this.parrotSays("Ouch, I've died!");
            return;
        }
        if (this.rumInBlood <5){
            this.rumInBlood++;
            this.parrotSays("Pour me anudder!");
        } else{
            this.sleeping =true;
            this.rumInBlood=0;
            this.parrotSays("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
        return;
    }

    public void die(){
        this.died = true;
        this.sleeping =false;
        this.rumInBlood=0;
        this.parrotSays(this.name+" died!");
        return;
    }

    public void brawl(Pirate other){
        if (this.sleeping) {
            this.parrotSays("I'am sleeping, wake me with rum!");
            return;
        }
        if (this.died) {
            this.parrotSays("Ouch, I've died!");
            return;
        }
        if (other.sleeping) {
            this.parrotSays("I'am sleeping, wake me with rum!");
            return;
        }
        if (other.died) {
            this.parrotSays("Ouch, I've died!");
            return;
        }
        switch ((int) (Math.random()*3)) {
            case 0:
                this.died=true;
                this.parrotSays("Ouch, I've died!");
                return;

            case 1:
                other.died=true;
                this.parrotSays("I've just kill that b'stard!");
                return;

            case 2:
            default:
                other.sleeping=true;
                this.sleeping=true;
                this.parrotSays("Lets sleep together:-)");
                return;
        }
    }

    @Override
    public String toString() {
        return this.name
                + "[(rums: " + rumInBlood + ")"
                + ((this.parrot)?" has parrot": "")
                + ((this.sleeping) ? ", zzz... ":"")
                + ((this.died) ? ", RIP":"")
                +"] ";
    }
}
