import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }
    private static String subInt(int number, int[] searchedArray){
        String strNumber = String.valueOf(number);
        ArrayList<Integer> result = new ArrayList<Integer>(0);
        for (int i = 0; i < searchedArray.length; i++){
           if (String.valueOf(searchedArray[i]).indexOf(strNumber)!=-1)
               result.add(i);
        }
        Integer[] arr = new Integer[result.size()];
        arr = result.toArray(arr);
        int[] res = new int[searchedArray.length];
        for (int i = 0; i < searchedArray.length; i++) {

        }
        return Arrays.toString(arr);
    }
}
