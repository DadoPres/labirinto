public class Tessera {
    private Apertura[] aperture;
    private Tesoro tesoro;

    public Tessera(){
        this.aperture = new Apertura[4];

        boolean valida = false;
        while(!valida){
            for(int i = 0; i < 4; i++){
                this.aperture[i] = new Apertura();
                if(this.aperture[i].isAperta() == true){
                    valida = true;
                }
            }
        }

        this.tesoro = new Tesoro();
    }

    protected char[][] tesseraToMatr(){
        char[][] res = new char[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int k = 3*i+j;
                //Scrivo # negli angoli
                if(k % 2 == 0 && k != 4){
                    res[i][j] = '#';
                }
            }
        }

        //Scrivo le aperture
        res[0][1] = aperture[0].isAperta() ? ' ' : '#';
        res[1][2] = aperture[1].isAperta() ? ' ' : '#';
        res[2][1] = aperture[2].isAperta() ? ' ' : '#';
        res[1][0] = aperture[3].isAperta() ? ' ' : '#';

        //Scrivo il centro
        if(tesoro.isPresente()){
            if(tesoro.getDimensione() == Dimensione.PICCOLO){
                res[1][1] = '*';
            }
            if(tesoro.getDimensione() == Dimensione.GRANDE){
                res[1][1] = '@';
            }
        }
        else{
            res[1][1] = ' ';
        }
        return res;
    }

    public void setAperture(Apertura[] ap){
        aperture = ap;
    }

    public void setTesoro(Tesoro tes){
        tesoro = tes;
    }

    public TesseraEsterna tessToTessEst(){
        TesseraEsterna est = new TesseraEsterna();
        est.setAperture(this.aperture);
        est.setTesoro(this.tesoro);
        return est;
    }
}
