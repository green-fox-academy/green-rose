import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        //Exercise1
        numbers1.stream().filter(x->x%2!=0).forEach(System.out::println);
        //Exercise2
        numbers1.stream().filter(x->x>0).mapToInt(x->x*x).forEach(System.out::println);
        //Exercise3
        List<Integer>numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers2.stream().mapToInt(x->x*x).filter(x->x>20).forEach(System.out::println);
        //Exercise4
        System.out.println( numbers1.stream().filter(x->x%2==0).mapToInt(x->x).average());

    }
}
