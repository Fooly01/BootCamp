package Aufgaben.Woche1.Streams.Bonus;

import java.util.stream.Collectors;

public class LettersNoMoreThan {


    /**
     * Übergen wird ein Wort und eine maximale Anzahl
     * Es soll überprüft werden, ob die Buchstaben aus diesem Wort nicht öfter auftauchen als erlaubt.
     */

    public boolean evaluate(String word, int maxAllowed) {
        return word.chars()
                .boxed()
                .collect(Collectors.groupingBy(a -> a, Collectors.counting()))
                .values()
                .stream()
                .allMatch(count -> count <= maxAllowed);
    }

    //als Tests extrahieren
    public static void main(String[] args) {
        System.out.println(new LettersNoMoreThan().evaluate("abc", 1)); // -> true
        System.out.println(new LettersNoMoreThan().evaluate("aabc", 1)); // -> false
        System.out.println(new LettersNoMoreThan().evaluate("aabbcc", 2)); // -> true
        System.out.println(new LettersNoMoreThan().evaluate("abcc", 3)); // -> true
        System.out.println(new LettersNoMoreThan().evaluate("abccccccccccc", 5)); // -> false
    }
}

