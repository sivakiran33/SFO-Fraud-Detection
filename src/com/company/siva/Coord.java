package com.company.siva;

/**
 * Created by sivakiran on 11/1/16.
 */
public class Coord {

    private float X;
    private float Y;

    public Coord() {
        this(0,0);
    }
    public Coord(float X, float Y) {
        this.X = X;
        this.Y = Y;
    }

    public float getX() {
        return X;
    }
    public float getY() {
        return Y;
    }

    public void setX(float X) {
        this.X = X;
    }
    public void setY(float Y) {
        this.Y = Y;
    }
}
