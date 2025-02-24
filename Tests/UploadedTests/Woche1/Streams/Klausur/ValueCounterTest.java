package UploadedTests.Woche1.Streams.Klausur;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static Aufgaben.Woche1.Streams.Klausur.ValueCounter.maxFound;
import static org.junit.Assert.*;

public class ValueCounterTest {
    @Test
    public void maxFoundTest() {
        Map<Integer, String> sut = new HashMap<>();

        assertEquals(0, maxFound(sut));

        sut.put(1, "eins");
        sut.put(2, "zwei");

        assertEquals(1, maxFound(sut));

        sut.put(2, "eins");

        assertEquals(2, maxFound(sut));
    }
}
