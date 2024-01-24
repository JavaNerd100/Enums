package blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {


    @Test
    void canWeGetHeartSymbol() {
        assertEquals("\u2665",Suit.HEARTS.toString());
    }
}