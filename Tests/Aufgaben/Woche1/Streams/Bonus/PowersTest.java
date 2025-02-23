package Aufgaben.Woche1.Streams.Bonus;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PowersTest {
    @Test public void testPowers() {
        int numberToTest = 6;

        Powers powers = new Powers();
        int[] sut = powers.powerOfTwo(numberToTest);

        for(int i = 0; i < sut.length; i++) {
            assertEquals((int) Math.pow(2,i), sut[i]);
        }
    }
}