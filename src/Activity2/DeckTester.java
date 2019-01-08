package Activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"A","B","C","D","E","F","G","H","I","J","K","L","M"};
        String[] suits = {"Bear","Unicorn","Panda","Koala"};
        int[] pointValue = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        Deck deck = new Deck(ranks, suits, pointValue);

        deck.shuffle();

        int size = deck.size();
        for(int i = 0; i < size;i++) {
            deck.deal();
        }

        System.out.println("Deck Empty: " + deck.isEmpty());
    }
}

