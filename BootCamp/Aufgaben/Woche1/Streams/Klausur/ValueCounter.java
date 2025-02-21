package Aufgaben.Woche1.Streams.Klausur;

import java.util.Map;
import java.util.stream.Collectors;

public class ValueCounter {

    /**
     * Implementieren Sie die Methode `maxFound`, die die Anzahl der Vorkommen des häufigsten Wertes in einer Map zurückgibt.
     * - Wenn die Map leer ist, geben Sie 0 zurück.
     */

    public static <K, V> int maxFound(Map<K, V> map) {
        return map
                .values()
                .stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .values()
                .stream()
                .mapToInt(Math::toIntExact)
                .reduce(0, Math::max);
    }
}

