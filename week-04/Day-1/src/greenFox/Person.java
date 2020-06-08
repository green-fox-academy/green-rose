package greenFox;

enum Gender{
    male,
    female
}

public class Person {

    String name;
    Integer age;
    Gender gender;

    public Person(){
        this.name = "Jane Doe";
        this.age= 30;
        this.gender=Gender.female;

    }
    public Person(String name, Integer age, String gender){
        this.name=name;
        this.age=age;
        this.gender=Gender.valueOf(gender);
    }

    public void introduce(){
        System.out.println("Hi, I'm " +name+", a "+age+ " year old "+gender.toString()+".");
    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }
}
