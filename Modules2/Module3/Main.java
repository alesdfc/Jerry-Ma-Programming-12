package Module3;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<Card> hand = deck.drawHand();
        for (Card card : hand) {
            System.out.println(card);
        }

        hand.sort(new SuitComparator());
        System.out.println("**SORTED BY SUIT BELOW**");
        for (Card card : hand) {
            System.out.println(card);
        }

        hand.sort(new NumberComparator());
        System.out.println("**SORTED BY NUMBER BELOW**");
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}
