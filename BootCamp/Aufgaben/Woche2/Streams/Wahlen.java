package Aufgaben.Woche2.Streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Wahlen {

    /**
     * Die Methode bekommt eine Liste von Stimmen (jeder Eintrag ist eine Partei).
     * Erstellen Sie eine Map, die für jede Partei zählt, wie oft sie gewählt wurde.
     */
    public Map<String, Integer> countVotes(List<String> votes) {
        return votes.stream()
                .collect(Collectors.groupingBy(a -> a, Collectors.counting()))
                .entrySet()
                .stream()
                .map(entry -> Map.entry(entry.getKey(), Math.toIntExact(entry.getValue())))
                //ersetzbar mit Map.Entry::getKey und Map.Entry::getValue
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
    }

    /**
     * Die Methode bekommt zwei Maps übergeben, einmal die alten und die neuen Wahlergebnisse (bestehend aus Partei und Prozentsatz)
     * Rückgabe sind die Änderungen der Wahlergebnisse (Wenn davor 20 und jetzt 5 -> -15)
     */
    public HashMap<String, Double> evaluateChanges(HashMap<String, Double> altesWahlergebnis, HashMap<String, Double> neuesWahlergebnis) {
        return neuesWahlergebnis
                .entrySet()
                .stream()
                .map(entry -> Map.entry(entry.getKey(), Math.round((entry.getValue() - altesWahlergebnis.get(entry.getKey()))*10.0)/10.0))
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(), (v1, v2) -> v1, HashMap::new));
    }

    /**
     * Der Bundestag hat 630 Sitze, geben Sie an welche Partei wie viele Sitze bekommt (runden!)
     * (die echte Berechnung ist zwar bisschen anders, aber hier einfach nur prozentual Berechnen)
     */
    public HashMap<String, Double> howManySeats(HashMap<String, Double> neuesWahlergebnis) {
        //ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }


    /**
     * Übergeben wird eine Map mit den Wahlbeteiligungen pro Bundesland.
     * Berechnen Sie die durchschnittliche Wahlbeteiligung über alle Bundesländer.
     */
    public double averageParticipation(Map<String, Double> wahlbeteiligung) {
        //ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }
}
