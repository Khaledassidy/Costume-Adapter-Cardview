package com.example.costumecardview;

public class travel {
    private int imageresource;
    private String desitantion_contry;
    private String country;

    public travel(int imageresource, String desitantion_contry,String country){
        this.imageresource=imageresource;
        this.country=country;
        this.desitantion_contry=desitantion_contry;

    }


    public int getImageresource() {
        return imageresource;
    }

    public void setImageresource(int imageresource) {
        this.imageresource = imageresource;
    }

    public String getDesitantion_contry() {
        return desitantion_contry;
    }

    public void setDesitantion_contry(String desitantion_contry) {
        this.desitantion_contry = desitantion_contry;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
