package UploadedTests.Woche1.Streams.Bonus;

import Aufgaben.Woche1.Streams.Bonus.Faculty;
import org.junit.Test;
import static org.junit.Assert.*;


public class FacultyTest {
    @Test
    //als Tests extrahieren
    public void facultyTest() {
        Faculty sut = new Faculty();
        assertEquals(sut.faculty(5),120);
        assertEquals(sut.faculty(3),6);
        assertEquals(sut.faculty(27),1484783616);
        assertEquals(sut.faculty(-1),0);
    }
}
