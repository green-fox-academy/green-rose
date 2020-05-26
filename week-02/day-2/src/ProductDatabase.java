import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductDatabase {
    public static void main(String[] args) {
        Map<String, Integer> products = Stream.of(new Object[][] {
                { "Eggs", 200 },
                { "Milk", 200 },
                { "Fish", 400 },
                { "Apples", 150 },
                { "Bread", 50 },
                { "Chicken", 550 },
        }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));

        String mostExpensiveProduct = null;
        String cheapestProduct = null;
        float avgPrice=0;
        boolean price125=false;
        int countPriceBellow300=0;
        int countProducts=products.size();

        for (String item: products.keySet()
             ) {
            if (mostExpensiveProduct==null){
                mostExpensiveProduct=item;
                cheapestProduct=item;
            }
            int value = products.get(item).intValue();
            if (value==125) price125=true;
            if (value<300) countPriceBellow300++;
            if (products.get(mostExpensiveProduct).intValue()<value) mostExpensiveProduct=item;
            if (products.get(cheapestProduct).intValue()>value) cheapestProduct=item;
            avgPrice+=value;
        }
        avgPrice/=countProducts;
        System.out.println("Fish is "+products.get("Fish"));
        System.out.println("Most expensive product is "+mostExpensiveProduct);
        System.out.println("The average price is "+avgPrice);
        System.out.println("There is "+countPriceBellow300+" product with price bellow 300");
        System.out.println(price125?"You can buy something for exactly 125.": "You can't buy a thing for 125.");


    }
}
