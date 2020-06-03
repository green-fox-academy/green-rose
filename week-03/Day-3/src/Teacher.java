public class Teacher {
    public void teach(Student student, String subject){
        student.learn(subject);
    }
    public void answer(String question){
        System.out.println("On your question: "+question);
        System.out.println("I must say: I do not know:-)");
    }
}
