package printableInterface;

public class App {
    public static void main(String[] args) {
        Domino d = new Domino(1,3);
        ToDo t = new ToDo ("Buy milk", "high", true);
        d.printAllFields();
        t.printAllFields();
    }
}
