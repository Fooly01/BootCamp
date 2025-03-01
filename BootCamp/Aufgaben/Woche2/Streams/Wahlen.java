package Aufgaben.Woche2.Streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wahlen {

    /**
     * Die Methode bekommt eine Liste von Stimmen (jeder Eintrag ist eine Partei).
     * Erstellen Sie eine Map, die für jede Partei zählt, wie oft sie gewählt wurde.
     */
    public Map<String, Integer> countVotes(List<String> votes) {
        //ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Die Methode bekommt zwei Maps übergeben, einmal die alten und die neuen Wahlergebnisse (bestehend aus Partei und Prozentsatz)
     * Rückgabe sind die Änderungen der Wahlergebnisse (Wenn davor 20 und jetzt 5 -> -15)
     */
    public HashMap<String,Double> evaluateChanges(HashMap<String,Double> altesWahlergebnis, HashMap<String,Double> neuesWahlergebnis){
        //ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Der Bundestag hat 630 Sitze, geben Sie an welche Partei wie viele Sitze bekommt (runden! es gibt nur ganze Stühle)
     * (die echte Berechnung ist zwar bisschen anders, aber hier einfach nur prozentual Berechnen)
     * 5% Hürde beachten!
     */
    public HashMap<String,Double> howManySeats(HashMap<String,Double> neuesWahlergebnis){
        //ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }


    /**
     * Übergeben wird eine Map mit den Wahlbeteiligungen pro Bundesland.
     * Berechnen Sie die durchschnittliche Wahlbeteiligung über alle Bundesländer. Runden auf eine Nachkommastelle
     */
    public double averageParticipation(Map<String, Double> wahlbeteiligung) {
        //ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }
}
