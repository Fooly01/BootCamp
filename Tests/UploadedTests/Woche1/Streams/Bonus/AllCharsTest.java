package UploadedTests.Woche1.Streams.Bonus;

import Aufgaben.Woche1.Streams.Bonus.AllChars;
import org.junit.Test;

import static Aufgaben.Woche1.Streams.Bonus.AllChars.*;
import static org.junit.Assert.*;

public class AllCharsTest {

    @Test
    public void testAllChars() {
        AllChars sut = new AllChars();
        assertEquals(sut.smallLetters().toString(),"[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]");
    }


}
