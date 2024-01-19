/*Todo
Classer:
* Spel
* spelare
* Kort
färg, nummer, och specialkort
* SpelFunktion

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        System.out.println("Russian UNO");
        System.out.println("Press s to start");
        String game = myScanner.nextLine();
        if (game.equals("s")) {
            new Spel();
        }

    }
}