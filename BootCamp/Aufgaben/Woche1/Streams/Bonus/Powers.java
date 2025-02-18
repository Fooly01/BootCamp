package Aufgaben.Woche1.Streams.Bonus;

import java.util.stream.Stream;

public class Powers {

    /**
     * Übergeben wird eine Anzahl an Malen, wie oft die Potenz der Basis 2 berechnet werden soll.
     * Ausgabe wie folgt: 1 2 4 8 16 32 64
     */
    public int[] powerOfTwo(int anzahl) {
        return Stream.iterate(0, i -> i <= anzahl, i -> ++i)
                .map(i -> Double.valueOf(Math.pow(2, i)).intValue())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
