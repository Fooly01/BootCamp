package Aufgaben.Woche1.Streams.Klausur;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record PlayingCard(Suit suit, Rank rank) {

    /**
     * Implementieren Sie eine Spielkarte (`PlayingCard`) mit den Eigenschaften `Suit` (Farbe) und `Rank` (Wert).
     * - Ein Joker hat keine Farbe und keinen Wert (beide sind `null`).
     */

    public static final PlayingCard JOKER = new PlayingCard(null, null);

    public enum Suit {CLUB, SPADE, DIAMOND, HEART}

    public enum Rank {N7, N8, N9, N10, JACK, QUEEN, KING, ACE}

    /**
     * Gibt eine Menge aller Spielkarten inklusive des Jokers zurück.
     *
     * @return Eine Menge aller Spielkarten.
     */
    public static Set<PlayingCard> all() {
        /*Lösung mit map anstatt flatMap
        return Stream.iterate(0, i -> i < Suit.values().length * Rank.values().length, i -> i + 1)
                .map(s -> new PlayingCard(Suit.values()[s%Suit.values().length()], Rank.values()[s%Rank.values().length]))
                .collect(Collectors.toSet());

        */
        Set<PlayingCard> cardSet = Arrays.stream(Suit.values())
                .flatMap(suit -> Arrays.stream(Rank.values())
                        .map(rank -> new PlayingCard(suit, rank)))
                .collect(Collectors.toSet());

        cardSet.add(JOKER);

        return cardSet;
    }
}

