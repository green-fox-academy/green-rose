import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        System.out.print("How many numbers?: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <=  count; i++) {
            System.out.print("No. "+(i)+" input:");
            int val = scanner.nextInt();
            sum +=val;
        }
        double avg = (double) sum/count;
        System.out.print("Sum: " +sum+", Average: "+avg);
    }
}
