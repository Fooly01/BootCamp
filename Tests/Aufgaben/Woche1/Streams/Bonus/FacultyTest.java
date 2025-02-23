package Aufgaben.Woche1.Streams.Bonus;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FacultyTest {
    @Test public void facultyTest() {
        int numberToTest = 11;

        Faculty faculty = new Faculty();
        int sut = faculty.faculty(numberToTest);
        int want = 1;
        for(int i = 11; i > 0; i--) {
            want *= i;
        }

        assertEquals(want, sut);
    }
}