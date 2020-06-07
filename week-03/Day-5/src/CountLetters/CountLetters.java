package CountLetters;

import java.util.HashMap;

public class CountLetters {
    public HashMap<Character, Integer> letterCounter (String sentence){
        HashMap<Character, Integer> results =  new HashMap<>();
        for (char ch:sentence.toCharArray()) {
            if (results.containsKey(ch)) results.put(ch,results.get(ch).intValue()+1);
            else results.put(ch,1);
        }
        return results;
    }

}
