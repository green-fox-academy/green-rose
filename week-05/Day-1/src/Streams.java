
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
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
        String string = "Vole, Žába na Prameni a kráva v potoce!!!";
        string.chars().mapToObj(c -> (char) c).filter(c->Character.isUpperCase(c)).forEach(System.out::println);
        //Exercise7
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        char par ='A';
        cities.stream().filter(s->s.charAt(0)==par).forEach(System.out::println);
        //Exercise8
        List<Character> chars = Arrays.asList('a','c','d','e','f');
        System.out.println(chars.stream().map(c->c.toString()).collect(Collectors.joining()));
        //Exercise9
        string.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c->1))).entrySet().stream().forEach(System.out::println);
        //Exercise10
        //Exercise11
        try {
            Stream.of(Files.readString(Paths.get("text.txt")).split("\\W+")).map(word->new String(word))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(c->1)))
                    .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(100).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("no file");
        }
        //Exercise11
        try {
            System.out.println(Files.lines(Paths.get("swcharacters.csv"))
                .skip(1)
                .map(line -> line.replace(",","."))
                .map(line -> Arrays.asList(line.split(";")))
                .filter(line->{
                    try {
                        Integer.parseInt(line.get(2));
                        return true;
                    }
                    catch (NumberFormatException e) {
                        return false;
                    }
                }).max((line1, line2)->(Integer.parseInt(line1.get(2))-Integer.parseInt(line2.get(2)))));
              ;

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("no file");
        }
    }
}
