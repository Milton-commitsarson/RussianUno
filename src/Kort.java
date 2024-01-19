import java.util.Random;


public class Kort {
    //Atribut
    int[] kortlek = new int [100];
    String[] färger = {"Röd", "Blå", "Gul", "Grön"};
    String[] nummer = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Stop", "Reverse", "+2"};
    String[] nummer = {"+4 välj färg", "välj färg"};
    private Random randomGenerator = new Random ();

    //Cunstructor
    public void nyttKort() {
        System.out.println("Du drog kortet: " +färger[randomGenerator.nextInt(färger.length)]+ " " +nummer[randomGenerator.nextInt(nummer.length)]);

    }

    //
}
