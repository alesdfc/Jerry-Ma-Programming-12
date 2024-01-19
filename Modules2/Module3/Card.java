package Module3;

public class Card {
    public enum Suit {
        HEARTS(2), CLUBS(1), SPADES(3), DIAMONDS(0);
        private final int value;
        private Suit(int value){
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    public enum Face {
        KING(13), QUEEN(12), JACK(11);
        private final int value;
        private Face(int value){
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    public int number;
    public Suit suit;
    public Face face;
    public Card(int number, Suit suit){
        this.number = number;
        this.suit = suit;
    }
    public Card(Face face, Suit suit){
        this.face = face;
        this.suit = suit;
    }
    public String toString(){
        if(this.number == 0){
            return "" + this.face + " of " + this.suit;
        } else {
            return "" + this.number + " of " + this.suit;
        }
    }

    public int getSuitValue() {
        Suit suit = this.suit;
        return suit.getValue();
    }

    public int getCardValue() {
        if(face != null) {
            Face suit = this.face;
            return suit.getValue();
        }
            return this.number;
    }
}
