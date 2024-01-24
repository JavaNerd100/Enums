package blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void canGetValueOfFiveCard() {
        Card card1 = new Card(Suit.DIAMONDS,Rank.FIVE);
        assertEquals(5,card1.getValue());
    }

    @Test
    void canGetValueOfThreeCard() {
        Card card1 = new Card(Suit.DIAMONDS,Rank.THREE);
        assertEquals(3,card1.getValue());
    }

    @Test
    void canGetValueOfAceCard() {
        Card card1 = new Card(Suit.DIAMONDS,Rank.ACE);
        assertEquals(1,card1.getValue());
    }


    @Test
    void canGetValueOfKingCard() {
        Card card1 = new Card(Suit.DIAMONDS,Rank.KING);
        assertEquals(10,card1.getValue());
    }

    @Test
    void canGetValueOfQueenCard() {
        Card card1 = new Card(Suit.DIAMONDS,Rank.QUEEN);
        assertEquals(10,card1.getValue());
    }
}