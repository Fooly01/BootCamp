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
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Aufgabe 2: Gruppieren, Zählen und Top-N Ergebnisse
     * Gegeben ist eine Liste von Zahlen. Zähle, wie oft jede Zahl vorkommt,
     * gib eine Map mit den häufigsten drei Zahlen zurück, sortiert nach Häufigkeit absteigend.
     */
    public static Map<Integer, Long> countAndSortOccurrences(List<Integer> numbers) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Aufgabe 3: Durchschnitt, Maximal- und Minimalwert berechnen
     * Gegeben ist eine Liste von Temperaturen in Celsius. Berechne die durchschnittliche Temperatur,
     * sowie den höchsten und niedrigsten Wert und gib diese als formatierte Zeichenkette zurück.
     */
    public static String calculateTemperatureStats(List<Double> temperatures) {
        // ToDo: Implement, 1 ersetzen mit den richtigen Werten
        return String.format("Durchschnitt: %.2f, Max: %.2f, Min: %.2f", 1);
    }

    /**
     * Aufgabe 4: Wörter sortieren und Gruppen erstellen
     * Sortiere eine Liste von Wörtern zuerst nach Länge (aufsteigend), dann alphabetisch.
     * Gruppiere die Wörter nach ihrer Anfangsbuchstaben und gib eine Map zurück.
     */
    public static Map<Character, List<String>> groupWordsByFirstLetter(List<String> words) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Aufgabe 5: Zahlen formatieren und als String zurückgeben
     * Wandle eine Liste von Zahlen in einen einzigen String um,
     * wobei die Zahlen durch Kommas getrennt sind, in aufsteigender Reihenfolge stehen
     * und jede Zahl in Klammern gesetzt ist.
     */
    public static String joinSortedNumbers(List<Integer> numbers) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Aufgabe 6: Finde das längste Wort und seine Länge
     * Gegeben ist eine Liste von Wörtern. Finde das längste Wort und seine Länge (bsp.: "Beispiel (8)")
     * Falls es mehrere gibt, gib das alphabetisch erste zurück, ansonsten gebe zurück "Keine Wörter vorhanden".
     */
    public static String findLongestWord(List<String> words) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Aufgabe 7: Primzahlen herausfiltern und summieren
     * Gegeben ist eine Liste von Zahlen. Entferne alle Zahlen, die keine Primzahlen sind,
     * und berechne die Summe aller Primzahlen.
     */
    public static int sumOfPrimes(List<Integer> numbers) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    // Hilfsmethode zur Primzahlprüfung
    private static boolean isPrime(int num) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }
}
