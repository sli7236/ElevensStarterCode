package Activity2;

/**
 * Created by Teacher on 1/7/2019.
 */
public class Card extends Activity1.Card {
    private String rank;
    private String suit;
    private int pointValue;

    public Card(String rank, String suit, int pointValue){
        super();
        this.rank = rank;
        this.suit = suit;
        this.pointValue = pointValue;
    }
}
