import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        //Exercise1
        numbers1.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        //Exercise2
        numbers1.stream().filter(x -> x > 0).mapToInt(x -> x * x).forEach(System.out::println);
        //Exercise3
        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers2.stream().mapToInt(x -> x * x).filter(x -> x > 20).forEach(System.out::println);
        //Exercise4
        System.out.println(numbers1.stream().filter(x -> x % 2 != 0).mapToInt(x -> x).average());
        //Exercise5
        List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        System.out.println(numbers1.stream().filter(x -> x % 2 != 0).mapToInt(x -> x).sum());
        //Exercise6
        String string = "Vole,Žába";
        string.chars().mapToObj(c -> (char) c).filter(c->Character.isUpperCase(c)).forEach(System.out::println);
    }
}
