package Aufgaben.Woche1.Streams.Klausur;

import java.util.stream.Stream;

public class MinMax {

    /**
     * Verwenden Sie keine Kontrollstrukturen, sondern Funktionsobjekte, Streams und Pipelines.
     * <p>
     * Implementieren Sie die Methode `find`, die ein Array mit 2 Elementen zurückgibt:
     * - Das erste Element ist der kleinste Wert aus dem Stream.
     * - Das zweite Element ist der größte Wert aus dem Stream.
     * <p>
     * Falls der Stream leer ist, geben Sie ein Array mit `Integer.MAX_VALUE` und `Integer.MIN_VALUE` zurück (in dieser Reihenfolge).
     */

    public static int[] find(Stream<Integer> numbers) {
        return numbers.reduce(
                new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE},
                (acc, x) -> new int[]{Math.min(acc[0], x), Math.max(acc[1], x)},
                (a, b) -> new int[]{Math.min(a[0], b[0]), Math.max(a[1], b[1])}
        );
    }
}

