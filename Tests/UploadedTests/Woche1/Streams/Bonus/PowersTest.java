package UploadedTests.Woche1.Streams.Bonus;

import Aufgaben.Woche1.Streams.Bonus.Powers;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;



public class PowersTest {

    @Test
    public void testPowers() {
        Powers sut = new Powers();

        assertEquals(Arrays.toString(sut.powerOfTwo(2)),"[1]");
        assertEquals(Arrays.toString(sut.powerOfTwo(3)),"[1, 2]");
        assertEquals(Arrays.toString(sut.powerOfTwo(4)),"[1, 2, 4]");
        assertEquals(Arrays.toString(sut.powerOfTwo(16)),"[1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384]");
    }
}
