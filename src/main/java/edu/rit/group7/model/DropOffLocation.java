package edu.rit.group7.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DropOffLocation {
    private int locationId;
    private String name;
    private String address;
    private List<String> acceptedCategories;
    private String openingTime;
    private String closingTime;
    private Double longitude;
    private Double latitude;


    // Getters and Setters

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getAcceptedCategories() {
        return acceptedCategories;
    }

    public void setAcceptedCategories(List<String> acceptedCategories) {
        this.acceptedCategories = acceptedCategories;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

}
