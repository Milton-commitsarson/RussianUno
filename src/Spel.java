import java.util.ArrayList;
import java.util.Scanner;

public class Spel {

    public Spel() {
        start();
    }

    private void start() {

        Kortlek kortlek = new Kortlek();// skapar kortlek med alla korten
        kortlek.blanda();//blandar alla korten i kortleken

        Bord bord = new Bord();

        Spelare spelare1 = new Spelare(); //skapar en ny spelare

        //bord.topKortet(kortlek.getTopCard());// första kortet
        //bord.visaTopKort();// visar första kortet




       for (int i = 0; i < 7; i++) {
            spelare1.fåNyttKort(kortlek.getTopCard());
        }

        //bord.add(spelare1.läggKort());
        //spelare1.visaHand();

        //kortlek.printDeck();


        spelare1.nummerLista();
        System.out.println("Spelare 1 välj ett kort");
        //spelare1.läggKort();
        //spelare1.visaHand();



        //bord.lagdtKort(spelare1.läggKort());
        bord.visaTopKort();



    }

}
