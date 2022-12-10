package com.driver;

public class Movie {
    private String name;
    private int duration ;
    private double rate;

    public Movie(String name, int duration, double rate) {
        this.name = name;
        this.duration = duration;
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(int duration) {
        this.duration = duration;
    }

    public void setRatings(double rate) {
        this.rate = rate;
    }
}
