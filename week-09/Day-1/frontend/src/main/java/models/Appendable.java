package models;

public class Appendable {
    private String appended;
    public Appendable(String appendTo) {
        this.appended=appendTo+"a";
    }

    public String getAppended() {
        return appended;
    }
}
