package UploadedTests.Woche1.Streams.Klausur;

import Aufgaben.Woche1.Streams.Klausur.PlayingCard;
import org.junit.jupiter.api.Test;

import static Aufgaben.Woche1.Streams.Klausur.PlayingCard.*;
import static Aufgaben.Woche1.Streams.Klausur.PlayingCard.Rank.*;
import static Aufgaben.Woche1.Streams.Klausur.PlayingCard.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class PlayingCardTest {
    @Test
    public void allCardsContained() {
        assertEquals(all().size(),33);
        int a = 0;
        for (int j = 0; j < Suit.values().length; j++) {
            for (int i = 0; i < Rank.values().length; i++) {
                assertTrue(all().contains(new PlayingCard(Suit.values()[j], Rank.values()[i])));
            }
        }
        assertTrue(all().contains(JOKER));
    }
}
