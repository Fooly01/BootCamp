package UploadedTests.Woche1.Streams.Bonus;

import org.junit.jupiter.api.Test;

import static Aufgaben.Woche1.Streams.Bonus.Faculty.faculty;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
