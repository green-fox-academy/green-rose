package models;

public class Action {
    private Integer until;

    public Action(Integer until) {
        this.until = until;
    }

    public Action() {
    }

    public ReAction sum(){
       return new ReAction((1+this.until)*this.until/2);
    }

    public ReAction factor(){
        return new ReAction(this.factoring(this.until));
    }

    private int factoring(int until) {
        if (until==1) return 1;
        return until*this.factoring(until-1);
    }

    public int getUntil() {
        return until;
    }

    public void setUntil(int until) {
        this.until = until;
    }
}
