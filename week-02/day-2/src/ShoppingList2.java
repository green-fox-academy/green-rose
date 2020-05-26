
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

        Map<String, Integer> aliceList = new HashMap<>() {{
            put("Rice", 1);
            put("Eggs", 5);
            put("Chicken Breasts", 2 );
            put("Apples", 1);
            put("Tomato", 10);
        }};

        HashMap<String,Map<String,Integer>> buyers = new HashMap<>();
        buyers.put("Bob",bobsList);
        buyers.put("Alice",aliceList);

        for (Map.Entry<String,Map<String,Integer>> buyer: buyers.entrySet()) {
            double priceOfProducts=0.0;
            int numberOfProducts=0;
            
            for (Map.Entry<String,Integer> item: buyer.getValue().entrySet()) {
                priceOfProducts+= ((double) item.getValue() * prices.get(item.getKey()));
                numberOfProducts+= item.getValue();

            }
            System.out.println(priceOfProducts);
            buyers.get(buyer.getKey()).put("sum",numberOfProducts);
            buyers.get(buyer.getKey()).put("size",buyers.get(buyer.getKey()).size());
        }

        System.out.println((buyers.get("Alice").get("Rice")>buyers.get("Bob").get("Rice"))?"Alice":"Bob");
        System.out.println((buyers.get("Alice").containsKey("Potato")?buyers.get("Alice").get("Potato"):0)>buyers.get("Bob").get("Potato")?"Alice":"Bob");
        System.out.println(buyers.get("Alice").get("size")>buyers.get("Bob").get("size")?"Alice":"Bob");
        System.out.println(buyers.get("Alice").get("sum")>buyers.get("Bob").get("sum")?"Alice":"Bob");

    }
}
