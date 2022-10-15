public class Posizione {
    private int x;

    private int y;

    public Posizione(){
        this.x = 0;
        this.y = 0;
    }

    public Posizione(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setPosizione(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //TODO: Gestire eccezione IndexOutOfBound
}
