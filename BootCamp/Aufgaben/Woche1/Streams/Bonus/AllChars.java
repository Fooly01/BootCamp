package Aufgaben.Woche1.Streams.Bonus;

import java.util.List;
import java.util.stream.Stream;

public class AllChars {

    /**
     * Gibt eine Liste mit allen Kleinbuchstaben zurück
     * Bsp.: abcdefghijklmnopqrstuvwxyz
     */
    public static List<Character> smallLetters(){
        return Stream.iterate('a', i -> i<='z', i -> ++i).toList();
    }

    //als Tests extrahieren
    public static void main(String[] args) {
        System.out.println(smallLetters());
    }
}
