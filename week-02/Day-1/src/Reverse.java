public class Reverse {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7,8};
        for (int i = 0; i < numbers.length/2; i++) {
            int swapper = numbers[i];
            numbers[i] = numbers[numbers.length-i-1];
            numbers[numbers.length-i-1] = swapper;
        }
        for (int num: numbers
        ) {
            System.out.println(num);
        }

    }
}