package com.larry.osakwe.oakland_tour;

/**
 * Created by Larry Osakwe on 6/7/2017.
 */

public class Location {

    private String name;
    private String address;
    private String number;
    private String description;
    private int imageResourceId;

    public Location(String name, String address, int imageResourceId) {
        this.name = name;
        this.address = address;
        this.imageResourceId = imageResourceId;
    }

    public Location(String name, String address, String number, int imageResourceId) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.imageResourceId = imageResourceId;
    }

    public Location(String name, String address, String number, String description, int imageResourceId) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.imageResourceId = imageResourceId;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }


}
