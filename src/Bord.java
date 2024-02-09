import java.util.ArrayList;

public class Bord {
    ArrayList<Kort> bord = new ArrayList<>();//skräp högen

    public void topKortet(Kort kort){
        bord.add(kort);

       if (bord.size() > 1){
            this.bord.remove(0);
        }
    }

    public void visaTopKort() {
        for (Kort kort : this.bord) {
            System.out.println(kort.getCardInfo());
        }
    }



    public void lagdtKort(Kort kort) {
        bord.add(kort);
    }

}
