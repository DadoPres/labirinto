import java.util.Random;

public class Trappola {
    private boolean esiste;
    private boolean rilevata;

    public Trappola(){
        Random rd = new Random();
        this.esiste = rd.nextBoolean();
        this.rilevata = false;
    }
}
