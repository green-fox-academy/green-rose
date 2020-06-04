package Pirates;

public class Pirate {
    static Integer noPirate =0;
    private int rumInBlood = 0;
    private boolean sleeping = false;
    private boolean died = false;
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

    private String parrotSays(String answer){
        if (this.parrot) return answer+" "+answer;
        else return answer;
    }

    public String drinkSomeRum(){
        if (this.sleeping) return this.parrotSays("I'am sleeping, wake me with rum!");
        if (this.died) return this.parrotSays("Ouch, I've died!");
        this.rumInBlood++;
        return this.parrotSays("Thanks.");
    }

    public String howsItGoingMate(){
        if (this.sleeping) return this.parrotSays("I'am sleeping, wake me with rum!");
        if (this.died) return this.parrotSays("Ouch, I've died!");
        if (this.rumInBlood <5){
            this.rumInBlood++;
            return this.parrotSays("Pour me anudder!");
        } else{
            this.sleeping =true;
            this.rumInBlood=0;
            return this.parrotSays("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public String die(){
        this.died = true;
        this.sleeping =false;
        this.rumInBlood=0;
        return (this.name+" died!");
    }

    public String brawl(Pirate other){
        if(other.sleeping) return this.parrotSays("Wake him first!");
        if (this.sleeping) return this.parrotSays("I'am sleeping, wake me with rum!");
        if(other.died) return this.parrotSays("No fight with dead pirate!");
        if (this.died) return this.parrotSays("Cant fight being not alive!");
        switch ((int) (Math.random()*3)) {
            case 0:
                this.died=true;
                return this.parrotSays("Ouch, I've died!");

            case 1:
                other.died=true;
                return this.parrotSays("I've just kill that b'stard!");

            case 2:
            default:
                other.sleeping=true;
                this.sleeping=true;
                return this.parrotSays("Lets sleep together:-)");
        }
    }

    @Override
    public String toString() {
        return this.name
                + "(" + rumInBlood + ")"
                + ((this.parrot)?" has parrot": "")
                + ((this.sleeping) ? ", zzz... ":"")
                + ((this.died) ? ", RIP":"");
    }
}
