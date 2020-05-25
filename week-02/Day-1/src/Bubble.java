import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //  Example:
        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }

    private static String bubble(int[] toSort) {
        return advancedBubble(toSort, false);
    }

    private static String advancedBubble(int[] toSort, boolean ascending) {
        int reverse = ascending ? 1 : -1;
        for (int i = 0; i < toSort.length-1; i++) {
            for (int j = i; j < toSort.length; j++) {
                if (reverse*toSort[i] < reverse*toSort[j]){
                    int swapper = toSort[i];
                    toSort[i] = toSort[j];
                    toSort[j] = swapper;
                }
            }

        }
        return Arrays.toString(toSort);
    }


}
