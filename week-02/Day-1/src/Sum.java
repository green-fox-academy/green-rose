public class Sum {
    public static void main(String[] args) {
        int num=10;
        System.out.println(sum(num));

    }
    private static int sum (int num){
        /* int suma =0;
        for (int i = 0; i <= num; i++) {
            suma+=i;
        }
        return suma; */
        return (int) ((double)num/2*(num+1));
    }
}
