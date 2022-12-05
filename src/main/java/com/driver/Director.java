package com.driver;

public class Director {
    private String nameD;
    private String country;
    private String Industry;

    public Director(String nameD, String country, String industry) {
        this.nameD = nameD;
        this.country = country;
        Industry = industry;
    }

    public String getNameD() {
        return nameD;
    }

    public String getCountry() {
        return country;
    }

    public String getIndustry() {
        return Industry;
    }

    public void setNameD(String nameD) {
        this.nameD = nameD;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setIndustry(String industry) {
        Industry = industry;
    }
}
