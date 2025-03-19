package Aufgaben.Woche4.Streams;

import java.util.*;
import java.util.stream.*;

public class StudiumsStart {


    /**
     * Aufgabe 1: Begrüßung der Erstsemester-Studierenden
     * Gegeben ist eine Liste von Namen der neuen Studierenden. Formatiere sie als Begrüßungstext:
     * Jeder Name soll in Großbuchstaben stehen und mit "Willkommen, " beginnen.
     * Gib eine Liste mit diesen Strings zurück.
     */
    public static List<String> welcomeStudents(List<String> students) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Aufgabe 2: Kurse nach Teilnehmerzahl sortieren
     * Gegeben ist eine Map von Kursnamen und ihrer Teilnehmerzahl. Sortiere die Kurse
     * absteigend nach der Teilnehmerzahl und gib die sortierte Map zurück.
     */
    public static Map<String, Integer> sortCoursesByParticipants(Map<String, Integer> courses) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Aufgabe 3: Durchschnittliche ECTS-Punkte berechnen
     * Eine Liste von ECTS-Punkten für belegte Kurse wird übergeben. Berechne die durchschnittlichen
     * ECTS-Punkte mit zwei Nachkommastellen.
     */
    public static String averageECTS(List<Integer> ectsPoints) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Aufgabe 4: Studierende alphabetisch gruppieren
     * Gegeben ist eine Liste von Namen. Gruppiere die Namen nach ihrem Anfangsbuchstaben in eine Map,
     * die die Buchstaben als Schlüssel und eine Liste der Namen als Wert enthält.
     */
    public static Map<Character, List<String>> groupStudentsByLetter(List<String> students) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Aufgabe 5: Module mit Mindest-ECTS herausfiltern
     * Gegeben ist eine Map von Modulnamen und ECTS-Punkten. Gib eine Liste der Module zurück,
     * die mindestens 5 ECTS haben, sortiert nach Modulnamen.
     */
    public static List<String> filterAndSortModules(Map<String, Integer> modules) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }

    /**
     * Aufgabe 6: Kürzester und längster Modultitel
     * Eine Liste von Modultiteln wird übergeben. Finde den kürzesten und den längsten Titel.
     * Falls mehrere gleich lang sind, gib den alphabetisch ersten zurück.
     * Rückgabeformat: "Kürzestes: [Titel] (X Zeichen), Längstes: [Titel] (Y Zeichen)"
     */
    public static String findShortestAndLongestModule(List<String> modules) {
        String shortest = "hier Stream andwenden";

        String longest = "hier Stream anwenden";

        //0 mit richtigen Werten ersetzen
        return String.format("Kürzestes: %s (%d Zeichen), Längstes: %s (%d Zeichen)", 0);
    }

    /**
     * Aufgabe 7: Studierende mit mehreren Fächern finden
     * Gegeben ist eine Liste von Studierenden und eine Map, die angibt, welche Studierenden
     * wie viele Fächer belegen. Gib eine Liste der Studierenden zurück, die mehr als zwei Fächer belegen.
     */
    public static List<String> findMultidisciplinaryStudents(Map<String, Integer> studentSubjects) {
        // ToDo: Implement
        throw new IllegalStateException("Not yet implemented");
    }
}


