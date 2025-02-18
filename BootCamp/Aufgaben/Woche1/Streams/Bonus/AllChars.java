package Aufgaben.Woche1.Streams.Bonus;

import java.util.List;
import java.util.stream.Stream;

public class AllChars {

    /**
     * Gibt eine Liste mit allen Kleinbuchstaben zurück
     * Bsp.: abcdefghijklmnopqrstuvwxyz
     */
    public List<Character> smallLetters(){
        return Stream.iterate('a', letter -> letter <= 'z', letter -> ++letter).toList();
    }
}
