package Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    Anagram a = new Anagram();
    @Test
    void anagramIfEmpty() {
        boolean result = a.anagram("","");
        assertSame(true, result);
    }
    @Test
    void anagramYes() {
        boolean result = a.anagram("anagram","margana");
        assertSame(true, result);
    }

    @Test
    void anagramNo() {
        boolean result = a.anagram("anagram","morgana");
        assertSame(false, result);
    }
}