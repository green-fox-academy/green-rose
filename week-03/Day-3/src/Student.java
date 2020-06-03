public class Student {
    public void learn(String subject){
        System.out.println("I learn "+subject);
    }
    public void question(Teacher teacher, String question){
        teacher.answer(question);
    }
}
