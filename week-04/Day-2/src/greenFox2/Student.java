package greenFox2;

public class Student extends Person{
    private String previousOrganization;
    private Integer skippedDays;

    public Student(String name, Integer age, String gender, String previousOrganization){
        super(name,age,gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays=0;
    }

    public Student(){
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays=0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " +name+", a "+age+ " year old "+gender.toString()
                +" from "+ previousOrganization+", who skipped "+ skippedDays+" days from the course already.");
    }
    public void skipDays(Integer numberOfDays){
        this.skippedDays+=numberOfDays;
    }
}
