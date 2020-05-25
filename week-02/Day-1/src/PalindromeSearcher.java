import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeSearcher {
    public static void main(String[] args) {
        System.out.println(searchPalindrome("dog goat dad duck doodle never"));
        System.out.println(searchPalindrome("apple"));
        System.out.println(searchPalindrome("racecar"));
        System.out.println(searchPalindrome(""));

    }

    private static String searchPalindrome(String sentence) {
        List<String> matches = new ArrayList<>();
        int step = 0;
        for (int i = 1; i < sentence.length()-1 ; i++) {
            if (sentence.charAt(i)==sentence.charAt(i+1)) step=1;
            else step=0;
            int pos = 1;
            while (i-pos>=0 && i+step+pos<sentence.length()){
                if (sentence.charAt(i-pos)==sentence.charAt(i+step+pos)) {
                    matches.add(sentence.substring(i-pos,i+step+pos+1));
                } else break;
                pos++;
            }
        }

        String[] arr = new String[matches.size()];
        arr = matches.toArray(arr);
        return Arrays.toString(arr);
    }

}
