package com.cmdf.colormeyellow.ColorSquare;

public class ColorSquare {
    public Color color;
    int score;
    SetColor setColor;

    // Creates a new ColorSquare object that is initially white, with a score of 0
    public ColorSquare() {
        this.color = new Color(255, 255,255);
        this.score = 0; //TODO: update with square box
    }

    // REQUIRES: score is an int [1-25]
    // MODIFIES: this
    // EFFECTS: gets score from XXX class in ui
    public void setScore(int score) { //TODO: update type of score
        this.score = score;
    }

    // REQUIRES: score is an int [1-25]
    // MODIFIES: this
    // EFFECTS: sets mood color based on ui score
    public void setColor (int score) {
        if (score == 1) {
            color = setColor.navy;
        } else if (score == 2) {
            color = setColor.lightBlue;
        } else if (score == 3) {
            color = setColor.green;
        } else if (score == 4) {
            color = setColor.lightGreen;
        } else {
            color = setColor.yellow;
        }
    }

}
