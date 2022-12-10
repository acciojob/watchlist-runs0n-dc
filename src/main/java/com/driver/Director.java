package com.driver;

public class Director {
    private String nameD;
    private int number;
    private double ratings;

    public Director(String nameD, int number,double ratings) {
        this.nameD = nameD;
        this.number = number;
        this.ratings = ratings;
    }

    public String getNameD() {
        return nameD;
    }

    public int  getnumber() {
        return number;
    }

    public double getRatings() {
        return ratings;
    }

    public void setNameD(String nameD) {
        this.nameD = nameD;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setIndustry(double ratings) {
        this.ratings = ratings;
    }
}
