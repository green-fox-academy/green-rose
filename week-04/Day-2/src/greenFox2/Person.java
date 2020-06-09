package greenFox2;

enum Gender{
    male,
    female
}

public class Person implements Cloneable{

    String name;
    Integer age;
    greenFox2.Gender gender;

    public Person(){
        this.name = "Jane Doe";
        this.age= 30;
        this.gender= greenFox2.Gender.female;

    }
    public Person(String name, Integer age, String gender){
        this.name=name;
        this.age=age;
        this.gender= greenFox2.Gender.valueOf(gender);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void introduce(){
        System.out.println("Hi, I'm " +name+", a "+age+ " year old "+gender.toString()+".");
    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }
}
