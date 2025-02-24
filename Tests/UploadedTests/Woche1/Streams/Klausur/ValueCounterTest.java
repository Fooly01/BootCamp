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

        assertEquals(maxFound(sut),0);

        sut.put(1, "eins");
        sut.put(2, "zwei");

        assertEquals(maxFound(sut),1);

        sut.put(1, "nochmal eins");

        assertEquals(maxFound(sut),2);
    }
}
