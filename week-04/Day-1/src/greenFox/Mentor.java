package greenFox;
enum Level{
    junior,
    intermediate,
    senior
}
// connect Level with "level".toString
public class Mentor extends Person{
    private Level level;

    public Mentor(){
        super();
        this.level=Level.intermediate;
    }

    public Mentor(String name, Integer age, String gender, String level){
        super(name,age,gender);
        this.level=Level.valueOf(level);
    }

    @Override
    public void getGoal(){
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " +name+", a "+age+ " year old "+gender.toString()+" "+level
                +" mentor.");
    }
}
