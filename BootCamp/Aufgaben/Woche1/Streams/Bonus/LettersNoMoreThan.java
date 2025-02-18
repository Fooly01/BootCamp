package Aufgaben.Woche1.Streams.Bonus;

import java.util.function.Function;
import java.util.stream.Collectors;

public class LettersNoMoreThan {


    /**
     * Übergen wird ein Wort und eine maximale Anzahl
     * Es soll überprüft werden, ob die Buchstaben aus diesem Wort nicht öfter auftauchen als erlaubt.
     */

    public boolean evaluate(String word, int maxAllowed) {
        return word.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .allMatch(count -> count <= maxAllowed);
    }
}

