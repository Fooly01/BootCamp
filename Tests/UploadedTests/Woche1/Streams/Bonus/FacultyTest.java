package UploadedTests.Woche1.Streams.Bonus;

import org.junit.Test;
import static org.junit.Assert.*;

import static Aufgaben.Woche1.Streams.Bonus.Faculty.faculty;

public class FacultyTest {
    @Test
    //als Tests extrahieren
    public void maifFacultyTest() {
        assertEquals(faculty(5),120);
        assertEquals(faculty(3),6);
        assertEquals(faculty(27),1484783616);
        assertEquals(faculty(-1),0);
    }
}
