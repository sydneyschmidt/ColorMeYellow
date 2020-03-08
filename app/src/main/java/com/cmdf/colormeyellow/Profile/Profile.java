package com.cmdf.colormeyellow.Profile;

public class Profile {
    private String name;
    private int dailyScore;
    private int averageScore;

    public Profile() {
        this.name = "Lily";
        this.dailyScore = 1;
        this.averageScore = 1;
    }

    private int getDailyScore() {
        return dailyScore; // stub once know other classes
    }

    private int getAverageScore() {
        return averageScore; // stub
    }
}
