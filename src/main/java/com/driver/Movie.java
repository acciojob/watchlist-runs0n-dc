package com.driver;

public class Movie {
    private String name;
    private String genre;
    private int ratings;

    public Movie(String name, String genre, int ratings) {
        this.name = name;
        this.genre = genre;
        this.ratings = ratings;
    }

    public String getGenre() {
        return genre;
    }

    public int getRatings() {
        return ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}
