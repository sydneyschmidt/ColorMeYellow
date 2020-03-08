package com.cmdf.colormeyellow.ColorSquare;

public class SetColor {
    Color navy;
    Color lightBlue;
    Color green;
    Color lightGreen;
    Color yellow;

    public void makeNavy() {
        this.navy = new Color(0,0,153);
    }

    public void makeLightBlue() {
        this.lightBlue = new Color(51,153, 255);
    }

    public void makeGreen() {
        this.green = new Color(51,204,51);
    }

    public void makeLightGreen() {
        this.lightGreen = new Color(204,255,153);
    }

    public void makeYellow() {
        this.yellow = new Color(255,255,0);
    }
}

