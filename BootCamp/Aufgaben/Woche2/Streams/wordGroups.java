package Aufgaben.Woche2.Streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class wordGroups {

    /**
     * Übergeben wird eine Liste mit Wörtern, geben Sie an, welches Wort am häufigsten auftritt (ansonsten 0)
     * Falls es mehrere Lösungen gibt, geben sie das erste Wort an
     */
    public String mostCommonWord(List<String> words) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Übergeben wird eine Map mit einem Thema und eine Liste and Wörtern passend zu dem Thema (z.B Obst - Apfel, Banane ...)
     * Es berechnet werden, wie lang das längste(!) Wort durchschnittlich ist.
     */
    public double averageMaxWordLengthPerCategory(Map<String, List<String>> wordCategories) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Übergeben wird eine Liste an Wörtern, geben Sie die drei beliebtesten Buchstaben und ihr die Anzahl ihres Auftretens an
     */
    public Map<Character, Integer> topThreeLetters(List<String> words) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }


    /**
     * Übergeben wird eine Liste an Wörtern, welche immer mit einer Wörterkette beginnt, jedoch irgendwann aufhört geben Sie an wie lang diese Kette ist.
     * Eine Wörterkette ist, wenn ein Wort mit dem Buchstaben anfängt, mit welchem das vorherige geendet hat
     * bsp.: "Apfel", "Lachs", "Sonne", "Hans"
     */
    public int longestWordChain(List<String> words) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Übergeben wird eine Liste von Wörtern.
     * Finde für jeden Anfangsbuchstaben das längste Wort.
     * Falls mehrere gleich lang sind, nimm das erste gefundene.
     */
    public Map<Character, String> longestWordPerInitial(List<String> words) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }


    /**
     * Übergeben wird eine Liste von Wörtern.
     * Berechne die durchschnittliche Wortlänge und runde auf die nächste ganze Zahl.
     */
    public int roundedAverageWordLength(List<String> words) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Übergeben wird eine Liste von Wörtern und ein Buchstabe.
     * Finde das kürzeste Wort, das diesen Buchstaben enthält.
     */
    public Optional<String> shortestWordContainingChar(List<String> words, char letter) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }
}
