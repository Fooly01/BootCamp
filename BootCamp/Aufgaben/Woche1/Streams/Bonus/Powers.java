package Aufgaben.Woche1.Streams.Bonus;

import java.util.stream.IntStream;

public class Powers {

    /**
     * Übergeben wird eine Anzahl an Malen, wie oft die Potenz der Basis 2 berechnet werden soll.
     * Ausgabe wie folgt: 1 2 4 8 16 32 64
     */
    public int[] powerOfTwo(int anzahl) {
        return IntStream.iterate(0, x -> x <= anzahl, x -> ++x)
                .map(x -> (int) Math.pow(2, x))
                .toArray();
    }
}
