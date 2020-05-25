public class PalindromeBuilder {
    public static void main(String[] args) {
        System.out.println(createPalindrome(""));
        System.out.println(createPalindrome("greenfox"));
        System.out.println(createPalindrome("123"));
    }
    private static String createPalindrome(String input){
        String output = input;
        for (int i = input.length()-1; i >= 0; i--) {
            output+=input.charAt(i);
        }
        return output;
    }
}
