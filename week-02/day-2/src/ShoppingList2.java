
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShoppingList2 {
    public static void main(String[] args) {

        Map<String, Double> prices = Stream.of(new Object[][] {
                { "Milk", 1.07 },
                { "Rice", 1.59 },
                { "Eggs", 3.14 },
                { "Cheese", 12.60 },
                { "Chicken Breasts", 9.40 },
                { "Apples", 2.31 },
                { "Tomato", 2.58 },
                { "Potato", 1.75 },
                { "Onion", 1.10 },
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (double) data[1]));

        Map<String, Integer> bobsList = Stream.of(new Object[][] {
                { "Milk", 3 },
                { "Rice", 2 },
                { "Eggs", 2 },
                { "Cheese", 1 },
                { "Chicken Breasts", 4 },
                { "Apples", 1 },
                { "Tomato", 2 },
                { "Potato", 1 },

        }).collect(Collectors.toMap(data -> (String) data[0], data -> (int) data[1]));

        Map<String, Integer> aliceList = Stream.of(new Object[][] {

                { "Rice", 1 },
                { "Eggs", 5 },

                { "Chicken Breasts", 2 },
                { "Apples", 1 },
                { "Tomato", 10 },

        }).collect(Collectors.toMap(data -> (String) data[0], data -> (int) data[1]));

        HashMap<String,Map<String,Integer>> buyers = new HashMap<>();
        buyers.put("Bob",bobsList);
        buyers.put("Alice",aliceList);
        for (String buyer: buyers.keySet()
             ) {
            var value=0.0;
            var sum=0;
            for (String items: buyers.get(buyer).keySet()
            ) {
                value+= ((double) buyers.get(buyer).get(items) * prices.get(items));
                sum+= buyers.get(buyer).get(items);

            }
            System.out.println(value);
            buyers.get(buyer).put("sum",sum);
            buyers.get(buyer).put("size",buyers.get(buyer).size());
        }
        System.out.println((buyers.get("Alice").get("Rice")>buyers.get("Bob").get("Rice"))?"Alice":"Bob");
        System.out.println((buyers.get("Alice").containsKey("Potato")?buyers.get("Alice").get("Potato"):0)>buyers.get("Bob").get("Potato")?"Alice":"Bob");
        System.out.println(buyers.get("Alice").get("size")>buyers.get("Bob").get("size")?"Alice":"Bob");
        System.out.println(buyers.get("Alice").get("sum")>buyers.get("Bob").get("sum")?"Alice":"Bob");



    }
}
