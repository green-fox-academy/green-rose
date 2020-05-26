import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
        Integer allExpenses = 0;
        Integer greatestExpense = numbers.get(0);
        Integer lowestExpense = numbers.get(0);
        float avgSpending =0f;
        for (Integer expense: numbers
             ) {
            allExpenses += expense;
            if (greatestExpense<=expense) greatestExpense=expense;
            if (lowestExpense>=expense) lowestExpense=expense;
        }
        System.out.println("Total: "+allExpenses);
        System.out.println("Lowest: "+lowestExpense);
        System.out.println("Greatest: "+greatestExpense);
        System.out.println("Average expense: "+ (float) allExpenses/numbers.size() );


    }
}
