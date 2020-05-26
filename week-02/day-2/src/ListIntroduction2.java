import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList<String>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");
        ArrayList<String> ListB = new ArrayList<>(ListA);
        System.out.println(ListA.contains("Durian"));
        ListB.remove("Durian");
        System.out.println(ListA.size()>ListB.size());
        ListA.indexOf("Avocado");
        ListB.indexOf("Durian");

        ListB.addAll(List.of("Passion Fruit", "Pomelo"));
        //System.out.println(ListB);
        System.out.println(ListA.get(4));



    }
}
