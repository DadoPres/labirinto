public class Partita {
    private Labirinto labirinto;
    private Giocatore giocatore;


    public Partita() {
        this.labirinto = new Labirinto();
        this.giocatore = new Giocatore();
    }

    public void stampaTurno(){
        giocatore.stampaInfo();
        labirinto.stampa(giocatore.getPosizione());
        labirinto.getTesseraEsterna().stampa();
    }





}
