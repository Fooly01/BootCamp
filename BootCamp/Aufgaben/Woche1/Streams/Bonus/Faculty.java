package Aufgaben.Woche1.Streams.Bonus;

import java.util.stream.Stream;

public class Faculty {

    /**
     * Übergabe einer Zahl n und Rückgabe der Fakultät von n
     */

    public static int faculty(int facultyOf){
        return Stream.iterate(facultyOf, i -> i >=1, i -> i-1)
                .reduce((first,second) -> first*second)
                .orElse(0);
    }


    //als Tests extrahieren
    public static void main(String[] args) {
        System.out.println(faculty(5));
        System.out.println(faculty(3));
        System.out.println(faculty(27));
        System.out.println(faculty(-1));
    }

}
