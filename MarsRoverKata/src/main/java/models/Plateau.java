package models;
import java.util.ArrayList;

public class Plateau {

    private int xLength;
    private int yLength;
    private ArrayList<Rover> rovers;

    public Plateau(int xLength, int yLength) {
        this.xLength = xLength;
        this.yLength = yLength;
    }

    public int getxLength() {
        return xLength;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }
}
