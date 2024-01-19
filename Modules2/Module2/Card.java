package Module2;

public class Card {
    public enum Suit {HEARTS, CLUBS, SPADES, DIAMONDS}
    public enum Face {KING, QUEEN, JACK}

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
}
