import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kortlek {


    ArrayList<Kort> kort = new ArrayList<>();
    String[] färger = {"Röd", "Blå", "Gul", "Grön"};
    String[] nummer = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Stop", "Reverse", "+2"};

    public Kortlek() {
        generateDeck();
    }

    public void generateDeck() {

        for(String färg: färger) {
            for(String num: nummer) {
                this.kort.add(new Kort(färg, num));
                this.kort.add(new Kort(färg, num));
            }

        }
    }

    public void printDeck() {
        for (Kort kort: this.kort) {
            System.out.println(kort.getCardInfo());
        }
    }

    public void blanda() { // blandar korten
        Collections.shuffle(kort);
    }

    public Kort getTopCard() {
        Kort takenCard = this.kort.get(0);
        this.kort.remove(this.kort.get(0));
        return takenCard;
    }

}