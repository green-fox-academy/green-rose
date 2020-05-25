import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
        System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));
    }

    private static String bubble(int[] toSort) {
        return advancedBubble(toSort, false);
    }

    private static String advancedBubble(int[] toSort, boolean ascending) {
        int reverse = ascending ? 1 : -1;

        for(int i = 0; i < toSort.length - 1; ++i) {
            for(int j = i; j < toSort.length; ++j) {
                if (reverse * toSort[i] < reverse * toSort[j]) {
                    int swapper = toSort[i];
                    toSort[i] = toSort[j];
                    toSort[j] = swapper;
                }
            }
        }

        return Arrays.toString(toSort);
    }
}

