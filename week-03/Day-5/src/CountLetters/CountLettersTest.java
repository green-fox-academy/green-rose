package CountLetters;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
   /* private String sentence= "Write a function, that takes a string as an argument " +
            "and returns a dictionary with all letters in the string as keys, " +
            "and numbers as values that shows how many occurrences there are.";
            */
    private String sentence= "Write";
    private CountLetters cl = new CountLetters();
    @Test
    void letterCounter() {
        HashMap<Character, Integer> result = cl.letterCounter(sentence);
        HashMap<Character, Integer> expected = new HashMap<Character, Integer>() {
            {
                put('W',1);
                put('r', 1);
                put('i', 1);
                put('t', 1);
                put('e', 1);
            }
        };
        assertEquals(result,expected);
    }
}