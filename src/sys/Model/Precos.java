package sys.Model;

import java.io.Serializable;

public class Precos implements Serializable{
    
    private double pP2;
    private double pP6;
    private double pP8;
    private double pP13;
    private double pP20;
    private double pP45;

    public Precos(double pP2, double pP6, double pP8, double pP13, double pP20, double pP45) {
        this.pP2 = pP2;
        this.pP6 = pP6;
        this.pP8 = pP8;
        this.pP13 = pP13;
        this.pP20 = pP20;
        this.pP45 = pP45;
    }

    public double getpP2() {
        return pP2;
    }

    public void setpP2(double pP2) {
        this.pP2 = pP2;
    }

    public double getpP6() {
        return pP6;
    }

    public void setpP6(double pP6) {
        this.pP6 = pP6;
    }

    public double getpP8() {
        return pP8;
    }

    public void setpP8(double pP8) {
        this.pP8 = pP8;
    }

    public double getpP13() {
        return pP13;
    }

    public void setpP13(double pP13) {
        this.pP13 = pP13;
    }

    public double getpP20() {
        return pP20;
    }

    public void setpP20(double pP20) {
        this.pP20 = pP20;
    }

    public double getpP45() {
        return pP45;
    }

    public void setpP45(double pP45) {
        this.pP45 = pP45;
    }

    @Override
    public String toString() {
        return "Precos{" + "pP2=" + pP2 + ", pP6=" + pP6 + ", pP8=" + pP8 + ", pP13=" + pP13 + ", pP20=" + pP20 + ", pP45=" + pP45 + '}';
    }
    
}
