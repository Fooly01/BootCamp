package Aufgaben.Woche1.Streams.Bonus;

import java.util.Arrays;
import java.util.stream.Stream;

public class Powers {

    /**
     * Übergeben wird eine Anzahl an Malen, wie oft die Potenz der Basis 2 berechnet werden soll.
     * Ausgabe wie folgt: 1 2 4 8 16 32 64
     */
    public static int[] powerOfTwo(int anzahl) {
        return Stream.iterate(1, value -> value < Math.pow(2,anzahl-1), value -> value * 2)
                .mapToInt(i -> i)
                .toArray();
    }


    //als Tests extrahieren
    public static void main(String[] args) {
        System.out.println(Arrays.toString(powerOfTwo(2)));
        System.out.println(Arrays.toString(powerOfTwo(3)));
        System.out.println(Arrays.toString(powerOfTwo(4)));
        System.out.println(Arrays.toString(powerOfTwo(16)));

    }
}
