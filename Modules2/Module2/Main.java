package Module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<Card> hand = deck.drawHand();
        for (Card card : hand) {
            System.out.println(card.toString());
        }
    }
}
