import java.util.ArrayList;
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Example
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    private static String unique(int[] ints) {
        ArrayList<Integer> result = new ArrayList<Integer>(0);

        for (int number: ints
             ) {
            if (!result.contains(number)) result.add(number);
        }
        Integer[] arr = new Integer[result.size()];
        arr = result.toArray(arr);
        return Arrays.toString(arr);
    }

}
