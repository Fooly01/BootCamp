package UploadedTests.Woche2.Streams;


import Aufgaben.Woche2.Streams.Wahlen;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;


public class WahlenTest {

    public final Wahlen wahlen = new Wahlen();

    @Test
    public void countVotesTest() {
        List<String> votes = Arrays.asList(
                "SPD", "CDU", "GRÜNE", "FDP", "AfD", "DIE LINKE",
                "SPD", "CDU", "GRÜNE", "FDP", "AfD", "DIE LINKE",
                "SPD", "CDU", "GRÜNE", "FDP", "AfD", "DIE LINKE"
        );

        Map<String, Integer> actual = wahlen.countVotes(votes);
        Map<String, Integer> expected = Map.of(
                "SPD", 3,
                "CDU", 3,
                "GRÜNE", 3,
                "FDP", 3,
                "AfD", 3,
                "DIE LINKE", 3);
        assertEquals(expected, actual);
    }


    @Test
    public void evalutateChangesTest() {
        // Wahlergebnisse 2021
        HashMap<String, Double> ergebnisse2021 = new HashMap<>();
        ergebnisse2021.put("SPD", 25.7);
        ergebnisse2021.put("CDU/CSU", 24.1);
        ergebnisse2021.put("GRÜNE", 14.8);
        ergebnisse2021.put("FDP", 11.5);
        ergebnisse2021.put("AfD", 10.3);
        ergebnisse2021.put("DIE LINKE", 4.9);

        // Wahlergebnisse 2025
        HashMap<String, Double> ergebnisse2025 = new HashMap<>();
        ergebnisse2025.put("CDU/CSU", 28.5);
        ergebnisse2025.put("AfD", 18.4);
        ergebnisse2025.put("SPD", 16.4);
        ergebnisse2025.put("GRÜNE", 13.8);
        ergebnisse2025.put("DIE LINKE", 8.8);
        ergebnisse2025.put("FDP", 4.3);

        // Erwartete Änderungen
        HashMap<String, Double> erwarteteAenderungen = new HashMap<>();
        erwarteteAenderungen.put("SPD", -9.3);
        erwarteteAenderungen.put("CDU/CSU", 4.4);
        erwarteteAenderungen.put("GRÜNE", -1.0);
        erwarteteAenderungen.put("FDP", -7.2);
        erwarteteAenderungen.put("AfD", 8.1);
        erwarteteAenderungen.put("DIE LINKE", 3.9);

        Map<String, Double> actual = wahlen.evaluateChanges(ergebnisse2021, ergebnisse2025);

        assertEquals(erwarteteAenderungen, actual);
    }

    @Test
    public void howManySeatsTest() {
        // Wahlergebnisse 2025
        HashMap<String, Double> ergebnisse2025 = new HashMap<>();
        ergebnisse2025.put("CDU/CSU", 28.5);
        ergebnisse2025.put("AfD", 18.4);
        ergebnisse2025.put("SPD", 16.4);
        ergebnisse2025.put("GRÜNE", 13.8);
        ergebnisse2025.put("DIE LINKE", 8.8);
        ergebnisse2025.put("FDP", 4.3);
        ergebnisse2025.put("BSW", 4.8);

        // Wahlergebnisse 2025
        HashMap<String, Double> expected = new HashMap<>();
        expected.put("CDU/CSU", (double) Math.round((28.5 / 100.0) * 630.0));
        expected.put("AfD", (double) Math.round(18.4 / 100 * 630));
        expected.put("SPD", (double) Math.round(16.4 / 100 * 630));
        expected.put("GRÜNE", (double) Math.round(13.8 / 100 * 630));
        expected.put("DIE LINKE", (double) Math.round(8.8 / 100 * 630));
        expected.put("FDP", (double) Math.round(0.0 / 100 * 630));
        expected.put("BSW", (double) Math.round(0.0 / 100 * 630));


        HashMap<String, Double> actual = wahlen.howManySeats(ergebnisse2025);
        System.out.println(expected);
        assertEquals(expected, actual);
    }

    @Test
    public void averageParticipationTest() {
        //Keine echten Ergebnisse! Nur Schätzungen!
        Map<String, Double> participation2025 = new HashMap<>();
        participation2025.put("Baden-Württemberg", 85.72);
        participation2025.put("Bayern", 87.72);
        participation2025.put("Berlin", 80.22);
        participation2025.put("Brandenburg", 79.72);
        participation2025.put("Bremen", 80.52);
        participation2025.put("Hamburg", 84.92);
        participation2025.put("Hessen", 84.22);
        participation2025.put("Mecklenburg-Vorpommern", 79.22);
        participation2025.put("Niedersachsen", 83.12);
        participation2025.put("Nordrhein-Westfalen", 83.92);
        participation2025.put("Rheinland-Pfalz", 84.42);
        participation2025.put("Saarland", 82.22);
        participation2025.put("Sachsen", 80.02);
        participation2025.put("Sachsen-Anhalt", 79.22);
        participation2025.put("Schleswig-Holstein", 84.12);
        participation2025.put("Thüringen", 80.72);

        Double expected = 82.5;
        Double actual = wahlen.averageParticipation(participation2025);

        assertEquals(expected, actual);
    }

}
