public class Labirinto {
    private Tessera[][] labirinto;
    private TesseraEsterna tesseraEsterna;

    public Labirinto(){
        this.labirinto = new Tessera[5][5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                this.labirinto[i][j] = new Tessera();
            }
        }

        this.tesseraEsterna = new TesseraEsterna();
    }

    public Tessera[][] getLabirinto() {
        return labirinto;
    }

    public void stampa(Posizione pos){
        //TODO: Da implementare
    }

    public TesseraEsterna getTesseraEsterna() {
        return tesseraEsterna;
    }
}
