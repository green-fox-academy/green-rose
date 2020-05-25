public class Factorio {
    public static void main(String[] args) {
        int num=3;
        System.out.println(fac(num));

    }
    private static long fac (int num){
        int suma =1;
        for (int i = num; i > 0; i--) {
            suma*=i;
        }
        return suma;

    }
}