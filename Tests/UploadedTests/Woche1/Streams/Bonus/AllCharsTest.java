package UploadedTests.Woche1.Streams.Bonus;

import org.junit.jupiter.api.Test;

import static Aufgaben.Woche1.Streams.Bonus.AllChars.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllCharsTest {

    @Test
    public void testAllChars() {
        assertEquals(smallLetters().toString(),"[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]");
    }
}
