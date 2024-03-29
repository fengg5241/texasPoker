package edu.ntnu.texasai.model.cards;


public class Card implements Comparable<Card> {
    private final CardSuit suit;
    private final CardNumber number;

    public Card(final CardSuit suit, final CardNumber number) {
        this.suit = suit;
        this.number = number;
    }

    @Override
    public String toString() {
        return suit.toString() + number.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) {
            return false;
        }

        Card other = (Card) obj;

        return suit.equals(other.suit) && number.equals(other.number);
    }

    
    public int compareTo(Card card) {
        return number.getPower() - card.number.getPower();
    }

    public CardSuit getSuit() {
        return suit;
    }

    /**
     * 2-14 带显示字体
     * @return
     */
    public CardNumber getNumber() {
        return number;
    }
}
