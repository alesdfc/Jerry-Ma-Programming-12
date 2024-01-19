package Module2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
public class Deck {
    private LinkedList<Card> deck = new LinkedList<>();

    public Deck(){
        LinkedList<Card> deck = createDeck();
        this.deck = shuffle(deck);
    }

    private LinkedList<Card> createDeck() {
        Card.Suit suit = null;
        LinkedList<Card> deck = new LinkedList<>();
        for(int i = 0; i < 4; i++){
            switch (i) {
                case 0:
                    suit = Card.Suit.HEARTS;
                    break;
                case 1:
                    suit = Card.Suit.DIAMONDS;
                    break;
                case 2:
                    suit = Card.Suit.SPADES;
                    break;
                case 3:
                    suit = Card.Suit.CLUBS;
                    break;
            }
            for(int j = 1; j < 11; j++){
                deck.add(new Card(j, suit));
            }
            deck.add(new Card(Card.Face.KING, suit));
            deck.add(new Card(Card.Face.QUEEN, suit));
            deck.add(new Card(Card.Face.JACK, suit));
        }
        return deck;
    }
    private LinkedList<Card> shuffle(LinkedList<Card> deck) {
        Collections.shuffle(deck);
        return deck;
    }
    public ArrayList<Card> drawHand() {
        ArrayList<Card> polledCards = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            polledCards.add(deck.poll());
        }
        return polledCards;
    }
}
