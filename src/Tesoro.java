import java.util.Random;

public class Tesoro {
    private boolean isPresente;
    private Dimensione dimensione;

    public Tesoro(){
        Random rd = new Random();
        this.isPresente = rd.nextBoolean();

        if(rd.nextInt() % 2 == 0){
            this.dimensione = Dimensione.PICCOLO;
        }
        else{
            this.dimensione = Dimensione.GRANDE;
        }
    }

    public int prendi(){
        this.isPresente = false;

        if(this.dimensione == Dimensione.PICCOLO){
            return 100;
        }
        else {
            return 1000;
        }
    }

    public boolean isPresente() {
        return isPresente;
    }

    public Dimensione getDimensione() {
        return dimensione;
    }
}
