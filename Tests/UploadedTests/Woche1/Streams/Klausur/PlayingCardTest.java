package UploadedTests.Woche1.Streams.Klausur;
import org.junit.Test;
import static org.junit.Assert.*;

import Aufgaben.Woche1.Streams.Klausur.PlayingCard;

import static Aufgaben.Woche1.Streams.Klausur.PlayingCard.*;


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
