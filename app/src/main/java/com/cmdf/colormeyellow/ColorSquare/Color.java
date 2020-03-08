package com.cmdf.colormeyellow.ColorSquare;

// Represents a colour with red, green, and blue component (range [0,225]
public class Color {
    //public static final int RED = new Color(246,10,10);
    int red;
    int green;
    int blue;

    //EFFECTS: constructs color (r, g, b)
    public Color(int r, int g, int b) {
        this.red = r;
        this.green = g;
        this.blue = b;
    }

    public String toString() {
        String name = "(" + red + " ," + green + " ," + blue + ")";
        return name;
    }

}
