package Aufgaben.Woche1.Streams.Bonus;

import java.util.stream.IntStream;

public class Faculty {

    /**
     * Übergabe einer Zahl n und Rückgabe der Fakultät von n
     */

    public int faculty(int facultyOf){
        return IntStream.iterate(facultyOf, x -> x > 0, x -> --x)
                .reduce(1, (a, b) -> a * b);
    }
}