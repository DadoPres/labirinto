import java.util.Random;

public class Apertura {
    private boolean aperta;
    private Trappola trappola;

    public Apertura(){
        Random rd = new Random();
        aperta = rd.nextBoolean();

        trappola = new Trappola();
    }

    public boolean isAperta() {
        return aperta;
    }

    public Trappola getTrappola() {
        return trappola;
    }
}
