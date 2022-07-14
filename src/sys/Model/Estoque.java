package sys.Model;

import java.io.Serializable;

public class Estoque implements Serializable{
    
    private int P2;
    private int P6;
    private int P8;
    private int P13;
    private int P20;
    private int P45;

    public Estoque(int P2, int P6, int P8, int P13, int P20, int P45) {
        this.P2 = P2;
        this.P6 = P6;
        this.P8 = P8;
        this.P13 = P13;
        this.P20 = P20;
        this.P45 = P45;
    }

    public int getP2() {
        return P2;
    }

    public void setP2(int P2) {
        this.P2 = P2;
    }

    public int getP6() {
        return P6;
    }

    public void setP6(int P6) {
        this.P6 = P6;
    }

    public int getP8() {
        return P8;
    }

    public void setP8(int P8) {
        this.P8 = P8;
    }

    public int getP13() {
        return P13;
    }

    public void setP13(int P13) {
        this.P13 = P13;
    }

    public int getP20() {
        return P20;
    }

    public void setP20(int P20) {
        this.P20 = P20;
    }

    public int getP45() {
        return P45;
    }

    public void setP45(int P45) {
        this.P45 = P45;
    }

    @Override
    public String toString() {
        return "Estoque{" + "P2=" + P2 + ", P6=" + P6 + ", P8=" + P8 + ", P13=" + P13 + ", P20=" + P20 + ", P45=" + P45 + '}';
    }
    
}
