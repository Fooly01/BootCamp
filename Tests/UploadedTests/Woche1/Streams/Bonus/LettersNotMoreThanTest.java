package UploadedTests.Woche1.Streams.Bonus;

import Aufgaben.Woche1.Streams.Bonus.LettersNoMoreThan;
import org.junit.Test;
import static org.junit.Assert.*;

public class LettersNotMoreThanTest {

    @Test
    public void testLetters() {
        LettersNoMoreThan sut = new LettersNoMoreThan();

        assertTrue(sut.evaluate("abc", 1));
        assertFalse(sut.evaluate("aabc", 1));
        assertTrue(sut.evaluate("aabbcc", 2));
        assertTrue(sut.evaluate("abcc", 3));
        assertFalse(sut.evaluate("abccccccccccc", 5));
    }
}
