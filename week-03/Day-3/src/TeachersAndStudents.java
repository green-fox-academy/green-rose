public class TeachersAndStudents {
    public static void main(String[] args) {
        Student mila = new Student();
        Teacher lukas = new Teacher();
        lukas.teach(mila,"Java");
        mila.question(lukas,"What the fuck is loop?");

    }
}
