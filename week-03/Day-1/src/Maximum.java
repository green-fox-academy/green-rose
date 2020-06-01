import java.util.Scanner;

public class Maximum {

    public static void main(String[] args) {
        int[] number = {5,21,20,1,0,13,30};

        System.out.println(fibNumber(number,number.length-1));

    }
    public static int fibNumber(int[] n, int pointer) {
        if (pointer==0) {
            return n[0];
        } else  return Math.max(n[pointer],fibNumber(n,pointer-1));

    }
}
