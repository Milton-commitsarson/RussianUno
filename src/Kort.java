import java.util.ArrayList;

public class Kort {

    private String suit;
    private String rank;

    public Kort(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public String getCardInfo() {
        return (this.suit + " | " + this.rank);
    }


}