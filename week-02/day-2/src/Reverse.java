public class Reverse {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        String  reversed;
        reversed = reverse2(toBeReversed);
        System.out.println(reversed);
    }

    private static String reverse2(String toBeReversed) {
        String reversed = "";
        char[] chars = toBeReversed.toCharArray();
        for (char ch: chars
             ) {
            reversed = ch+reversed;
        }
        return reversed;
    }

    private static String reverse(String toBeReversed) {
        String reversed = "";
        for (int i = toBeReversed.length()-1; i >=0 ; i--) {
            reversed+= toBeReversed.charAt(i);
        }
        return reversed;
    }
}
