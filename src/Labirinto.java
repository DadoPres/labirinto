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
        char[][] out = new char[15][15];
        //Itero sulle tessere
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                //Itero dentro ogni tessera e creo la matrice del labirinto
                char[][] matrTess = labirinto[i][j].tesseraToMatr();
                for(int k = 0; k < 3; k++){
                    for(int h = 0; h < 3; h++){
                        out[3*i+k][3*j+h] = matrTess[k][h];
                    }
                }
            }
        }

        //Inserisco la G per indicare la posizione del giocatore
        out[3*pos.getX()+1][3*pos.getY()+1] = 'G';

        //Stampo il labirinto a partire dalla matrice
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j++){
                System.out.print(out[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void shiftColonna(int indice, DirezioneColonna dir){
        Tessera tow = tesseraEsterna;
        Tessera tmp;
        if(dir == DirezioneColonna.SOPRA){
            for(int i = 0; i < 5; i++){
                tmp = labirinto[i][indice];
                labirinto[i][indice] = tow;
                tow = tmp;
                }
            }
        else if(dir == DirezioneColonna.SOTTO){
            for(int i = 0; i < 5; i++){
                tmp = labirinto[5-i][indice];
                labirinto[5-i][indice] = tow;
                tow = tmp;
            }
        }
        tesseraEsterna = tow.tessToTessEst();
    }

    public TesseraEsterna getTesseraEsterna() {
        return tesseraEsterna;
    }
}

enum DirezioneColonna {
    SOPRA, SOTTO
}
enum DirezioneRiga{
    DESTRA, SINISTRA
}
