import java.util.HashMap;


public class MapIntroduction1 {
    public static void main(String[] args) {
        HashMap<Integer,Character> mapOfChar= new HashMap<Integer,Character>();
        System.out.println(mapOfChar.isEmpty());
        mapOfChar.put( 97,'a');
        mapOfChar.put(98,'b');
        mapOfChar.put(99,'c');
        mapOfChar.put(65,'A');
        mapOfChar.put(66,'B');
        mapOfChar.put(67,'C');
        System.out.println(mapOfChar.keySet());
        System.out.println(mapOfChar.values());
        mapOfChar.put(68,'D');
        System.out.println(mapOfChar.size());
        System.out.println(mapOfChar.get(99));
        mapOfChar.remove(97);
        System.out.println(mapOfChar.containsKey(100));
        mapOfChar.clear();
        System.out.println(mapOfChar.isEmpty());

    }
}
