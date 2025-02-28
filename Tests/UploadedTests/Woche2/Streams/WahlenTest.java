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




}
