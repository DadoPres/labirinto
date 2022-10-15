public class TesseraEsterna extends Tessera{
    public void rotate(){

    }

    public void stampa(){
        char[][] matr = tesseraToMatr();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
