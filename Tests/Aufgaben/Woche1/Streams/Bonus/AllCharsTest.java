package Aufgaben.Woche1.Streams.Bonus;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;




public class AllCharsTest {
    @Test public void testAllChars() {
        AllChars allChars = new AllChars();
        List<Character> sut = allChars.smallLetters();

        List<Character> want = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            want.add(c);
        }

        assertEquals(sut, want);
    }
}