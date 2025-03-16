package Aufgaben.Woche3.Streams;

import java.util.*;
import java.util.stream.*;

public class StreamAufgaben {

    /**
     * Aufgabe 1: Komplexes Filtern und Mappen
     * Gegeben ist eine Liste von Namen. Entferne alle Namen, die kürzer als 4 Zeichen sind,
     * oder einen Vokal als ersten Buchstaben haben. Wandle sie in Großbuchstaben um,
     * hänge die Länge des Namens an (bsp.: "Beispiel (8)") und sortiere sie alphabetisch.
     */
    public static List<String> filterAndTransformNames(List<String> names) {
        return names
                .stream()
                .filter(n -> n.length() > 3 && !n.substring(0, 1).matches("^[AEIOU].*"))
                .map(n -> n.toUpperCase() + " " + n.length())
                .sorted()
                .toList();
    }

    /**
     * Aufgabe 2: Gruppieren, Zählen und Top-N Ergebnisse
     * Gegeben ist eine Liste von Zahlen. Zähle, wie oft jede Zahl vorkommt,
     * gib eine Map mit den häufigsten drei Zahlen zurück, sortiert nach Häufigkeit absteigend.
     */
    public static Map<Integer, Long> countAndSortOccurrences(List<Integer> numbers) {
        return numbers
                .stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a, b) -> Long.compare(a.getValue(), b.getValue()))
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
    }

    /**
     * Aufgabe 3: Durchschnitt, Maximal- und Minimalwert berechnen
     * Gegeben ist eine Liste von Temperaturen in Celsius. Berechne die durchschnittliche Temperatur,
     * sowie den höchsten und niedrigsten Wert und gib diese als formatierte Zeichenkette zurück.
     */
    public static String calculateTemperatureStats(List<Double> temperatures) {
        DoubleSummaryStatistics stats =
                temperatures
                .stream()
                .mapToDouble(a -> a)
                .summaryStatistics();

        return String.format("Durchschnitt: %.2f, Max: %.2f, Min: %.2f", stats.getAverage(), stats.getMax(), stats.getMin());
    }

    /**
     * Aufgabe 4: Wörter sortieren und Gruppen erstellen
     * Sortiere eine Liste von Wörtern zuerst nach Länge (aufsteigend), dann alphabetisch.
     * Gruppiere die Wörter nach ihrer Anfangsbuchstaben und gib eine Map zurück.
     */
    public static Map<Character, List<String>> groupWordsByFirstLetter(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(String::compareTo))
                .collect(Collectors.groupingBy(word -> word.charAt(0), LinkedHashMap::new, Collectors.toList()));
    }

    /**
     * Aufgabe 5: Zahlen formatieren und als String zurückgeben
     * Wandle eine Liste von Zahlen in einen einzigen String um,
     * wobei die Zahlen durch Kommas getrennt sind, in aufsteigender Reihenfolge stehen
     * und jede Zahl in Klammern gesetzt ist.
     */
    public static String joinSortedNumbers(List<Integer> numbers) {
        return numbers
                .stream()
                //Ausdruck im sorted unnötig, nur zum Verständnis
                .sorted(Comparator.comparingInt(Integer::intValue))
                .map(a -> "(" + a.toString() + ")")
                .collect(Collectors.joining(", "));
    }

    /**
     * Aufgabe 6: Finde das längste Wort und seine Länge
     * Gegeben ist eine Liste von Wörtern. Finde das längste Wort und seine Länge (bsp.: "Beispiel (8)")
     * Falls es mehrere gibt, gib das alphabetisch erste zurück, ansonsten gebe zurück "Keine Wörter vorhanden".
     */
    public static String findLongestWord(List<String> words) {
        return words
                .stream()
                .max(Comparator.comparingInt(String::length))
                .map(word -> word + " (" + word.length() + ")")
                .orElse("Keine Wörter vorhanden");
    }

    /**
     * Aufgabe 7: Primzahlen herausfiltern und summieren
     * Gegeben ist eine Liste von Zahlen. Entferne alle Zahlen, die keine Primzahlen sind,
     * und berechne die Summe aller Primzahlen.
     */
    public static int sumOfPrimes(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(n -> isPrime(n))
                .reduce(0, (a,b) -> a+b);
        /* auch möglich:
                .mapToInt(Integer::intValue)
                .sum()
        */
    }

    // Hilfsmethode zur Primzahlprüfung
    private static boolean isPrime(int num) {
        for (int i = 2; i < num-1; i++) {
            if (num % i == 0) {}
                return false;
        }
        return true;
    }

}
