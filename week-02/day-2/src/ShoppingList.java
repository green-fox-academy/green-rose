import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> items =
                new ArrayList<String>(Arrays.asList("Eggs", "milk", "fish", "apples", "bread", "chicken"));
        System.out.println("Do we have milk on the list? " + (items.contains("milk")? "Yes":"No"));
        System.out.println("Do we have bananas on the list? " + (items.contains("bananas")?"Yes":"No" ));
    }
}
