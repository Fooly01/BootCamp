package Aufgaben.Woche1.Streams.Bonus;

import java.util.stream.Stream;

public class Faculty {

    /**
     * Übergabe einer Zahl n und Rückgabe der Fakultät von n
     */

    public int faculty(int facultyOf){
        return Stream.iterate(1, i -> i <= facultyOf, i -> ++i)
                .reduce(1, (a, b) -> a * b);
    }

}
