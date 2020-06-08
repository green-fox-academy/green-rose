package greenFox;

import java.nio.charset.IllegalCharsetNameException;

public class Sponsor extends Person{
    public String company;
    public Integer hiredStudents;

    public Sponsor(){
        super();
        this.hiredStudents=0;
        this.company="Google";
    }
    public Sponsor(String name, Integer age, String gender, String company){
        super(name,age,gender);
        this.company=company;
        this.hiredStudents=0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " +name+", a "+age+ " year old "+gender
                +", who represents "+company+ " and hired " + hiredStudents + "students so far.");
    }

    public void hire(){
        this.hiredStudents++;
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}
