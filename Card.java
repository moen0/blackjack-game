enum Suit {
    HEARTS, DIAMONDS, SPADES, CLUBS
}

enum Rank {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(10), QUEEN (10), KING(10);

    private final int value;

    Rank(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    }
    public class Card {
        private final Suit suit;
        private final Rank rank;

        public Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }
        public Suit getSuit() {
            return suit;
        } //retrieve farge metod

        public Rank getRank() {
            return rank;
        } // retrieve rang metod

        public int getValue() {
            return rank.getValue();
        }

        public boolean isAce() {
            return rank == Rank.ACE;
        }

        @Override
        public String toString() {
            return rank + " of " + suit;
        }
    }

