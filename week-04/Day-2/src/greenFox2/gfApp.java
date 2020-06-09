package greenFox2;

public class gfApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student mary = new Student("John", 20,"male","BME");
        Student john = (Student) mary.clone();
        john.name="CLOONEY";
        john.introduce();
        mary.introduce();
    }
}
