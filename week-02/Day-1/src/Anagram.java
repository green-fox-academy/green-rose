import java.util.ArrayList;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("dog","god"));
        System.out.println(anagram("green","fox"));
        System.out.println(anagram("forty five","over fifty"));

    }

    private static boolean anagram(String original, String match) {
        // these two lines only if spacing doesnt matter
        original=original.replaceAll(" ","");
        match=match.replaceAll(" ","");

        List<Character> listMatch = new ArrayList<>();
        for (char ch : match.toCharArray()) {
            listMatch.add(ch);
        }
        for (int i = 0; i < original.length(); i++) {
            int isMatched = listMatch.indexOf(original.charAt(i));
            if (isMatched==-1) return false;
            else listMatch.remove(isMatched);
        }
        if (!listMatch.isEmpty()) return  false;
        else return true;
            
        }
    }


