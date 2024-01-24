package blackjack;

public enum Suit {
    CLUBS('\u2663'),
    DIAMONDS('\u2666'),
    HEARTS('\u2665'),
    SPADES('\u2660');

    private char symbols;

    Suit(char symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return Character.toString(this.symbols);
    }
}
