public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        String[] orders = {"first", "second", "third"};
        // - Swap the first and the third element of `orders`
        String order = orders[0];
        orders[0] = orders[2];
        orders[2] = order;
        for (String ordr:orders
        )
            System.out.println(ordr);

    }
}
