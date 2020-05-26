import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductDatabase2 {
    public static void main(String[] args) {
        Map<String, Integer> products = Stream.of(new Object[][] {
                { "Eggs", 200 },
                { "Milk", 200 },
                { "Fish", 400 },
                { "Apples", 150 },
                { "Bread", 50 },
                { "Chicken", 550 },
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
        ArrayList<String> productLess201 = new ArrayList<String>();
        HashMap<String, Integer> productOver150 = new HashMap<>();

        for (String key: products.keySet()
             ) {
            var value=products.get(key).intValue();
            if (value<201) productLess201.add(key);
            if (value>150) productOver150.put(key,value);
        }
        for (String product:productLess201
             ) {
            System.out.println(product);
        }
        for (String product:productOver150.keySet()
             ) {
            System.out.println(product+" costs "+productOver150.get(product));
        }


    }
}
