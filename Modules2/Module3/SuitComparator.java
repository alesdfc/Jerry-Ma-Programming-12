package Module3;
import java.util.Comparator;
public class SuitComparator implements Comparator<Card>{

    /**
     * @param card1 must be a Card object.
     * @param card2 must be a Card object.
     * @return 1 if card1 has a higher number value, -1 if card1 has a lower number value than card2, and 0 if they are equal.
     */
    @Override
    public int compare(Card card1, Card card2) {
        if(card1.getSuitValue() < card2.getSuitValue()){
            return 1;
        } else if (card1.getSuitValue() > card2.getSuitValue()){
            return -1;
        }
        return 0;
    }
}
