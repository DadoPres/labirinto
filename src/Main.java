public class Main {
    public static void main(String[] args){

        System.out.println();

        Labirinto l = new Labirinto();
        Posizione p = new Posizione();
        l.getTesseraEsterna().stampa();
        l.stampa(p);

        System.out.println("\n+++++++++++++++\n");

        l.shiftColonna(1, DirezioneColonna.SOPRA);
        l.stampa(p);
    }
}
