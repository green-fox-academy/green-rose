package models;

public class Greeter {
    private String welcome_message;

    public Greeter(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public Greeter() {
    }

    public Greeter(String name, String title) {
        this.welcome_message = "Oh, hi there "+name+", my dear "+title+"!";
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String name, String title) {
        this.welcome_message = "Oh, hi there "+name+", my dear "+title+"!";
    }
}
