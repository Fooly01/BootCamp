package UploadedTests.Woche1.Streams.Bonus;

import Aufgaben.Woche1.Streams.Bonus.LettersNoMoreThan;
import org.junit.Test;
import static org.junit.Assert.*;

public class LettersNotMoreThanTest {

    @Test
    public void testLetters() {
        LettersNoMoreThan lettersNoMoreThan = new LettersNoMoreThan();

        assertTrue(lettersNoMoreThan.evaluate("abc", 1));
        assertFalse(lettersNoMoreThan.evaluate("aabc", 1));
        assertTrue(lettersNoMoreThan.evaluate("aabbcc", 2));
        assertTrue(lettersNoMoreThan.evaluate("abcc", 3));
        assertFalse(lettersNoMoreThan.evaluate("abccccccccccc", 5));
    }
}
