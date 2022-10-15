public class Giocatore {
    private int vita;
    private int punteggio;
    private Posizione posizione;

    public Giocatore() {
        this.vita = 3;
        this.punteggio = 0;
        this.posizione = new Posizione();
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public void setPosizione(Posizione posizione) {
        this.posizione = posizione;
    }

    public int getVita() {
        return vita;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public Posizione getPosizione() {
        return posizione;
    }

    public void stampaInfo(){
        System.out.println("Vita: " + this.vita);
        System.out.println("Punteggio: " + this.punteggio);
        System.out.println("Posizione: (" + this.posizione.getX() + ", " + this.posizione.getY());
    }
}
