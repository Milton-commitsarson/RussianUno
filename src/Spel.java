import java.util.Scanner;

public class Spel {

    public Spel() {

        start();
    }

    private void start() {
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("Tryck på t för att ta ett kort");
        String taKort = myScanner2.nextLine();
        if (taKort.equals("t")) {
            Kort nyttKort = new Kort();
            nyttKort.nyttKort();
        }
    }

}
