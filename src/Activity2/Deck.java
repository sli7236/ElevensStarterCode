package Activity2;

/**
 * Created by Teacher on 1/7/2019.
 */
import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    List<Card> unDealt = new ArrayList<Card>();
    List<Card> Dealt = new ArrayList<Card>();

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;


    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param pointValue is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] pointValue){
        for(int i = 0; i < suits.length; i++){
            for(int j = 0 ; j < ranks.length; j++){
                Card newCard = new Card(ranks[j],suits[i],pointValue[j]);
                unDealt.add(newCard);
            }
        }
    }


    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        if(unDealt.size()==0){
            return true;
        }
        return false;
    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() {
        return unDealt.size();
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
        unDealt.addAll(Dealt);
        Dealt.clear();
        for(int i = unDealt.size()-1; i >= 0; i--){
            int r = (int)(Math.random() * unDealt.size());
            swap(unDealt,i,r);
        }
    }

    public void swap(List<Card> list,int i, int j){
        Card temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() {
        Card topCard = unDealt.get(0);
        if(topCard==null){
            return null;
        }
        unDealt.remove(0);
        Dealt.add(topCard);
        System.out.println(topCard.toString());
        return topCard;
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        /*String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;*/
        String result = "";
        for(int i =0 ; i< unDealt.size();i++){
            result+=unDealt.get(i).toString() + " ";
        }
        return result;
    }
}

