package edu.ntnu.texasai.model.cards;

public enum CardNumber {
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    JACK("J", 11),
    QUEEN("Q", 12),
    KING("K", 13),
    ACE("A", 14);

    private final String symbol;
    private final int power;

    private CardNumber(String symbol, int power) {
        this.symbol = symbol;
        this.power = power;
    }

    @Override
    public String toString() {
        return symbol;
    }

    /**
     * 2-14
     * @return
     */
    public int getPower() {
        return power;
    }    
}
