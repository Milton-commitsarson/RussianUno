import java.util.ArrayList;
import java.util.Scanner;

public class Spelare {
    Scanner myScanner = new Scanner(System.in);
    ArrayList<Kort> hand = new ArrayList<>();

    public Spelare() {

    }

    public void fåNyttKort(Kort kort) {
        hand.add(kort);


    }

    public void nummerLista() {
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(i + ": " + hand.get(i).getSuit() + " | " + hand.get(i).getRank());
        }
    }


    public void visaHand() {
        for (Kort kort : this.hand) {
            System.out.println(kort.getCardInfo());
        }
    }

    public Kort läggKort() {
        System.out.println("välj vilket kort du vill lägga");
        int kortVal = Integer.parseInt(myScanner.nextLine());
        Kort kortTillHög = this.hand.get(kortVal);

        if (giltigtKort(kortTillHög, topCard)){
            this.hand.remove(this.hand.get(kortVal));
            return kortTillHög;
        }
        else {
            System.out.println("Ogiltigt drag. Försök igen.");
            return läggKort(topCard);
        }


    }
    // gör så att när korten läggas i handen så får det ett nummer framför
    //anväd typ korden (this.kort.remove(this.kort.get(0));) för att ta bort de som användare valt
}
