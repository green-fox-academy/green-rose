package greenFox;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Cohort {
    public List<Student> students;
    public List<Mentor> mentors;
    public String name;

    public Cohort(String name) {
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
        this.name = name;
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public void addMentor(Mentor mentor){
        this.mentors.add(mentor);
    }
    public void info(){
        System.out.println("The "+ name +" cohort has "+students.size() +"students and "+mentors.size()+"  mentors.");
    }
}
