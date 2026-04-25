// Hussein Al Salami - 746006849
package edu.rit.group7.model;

import jakarta.persistence.*;

@Entity
@Table(name = "drop_off_location")
public class DropOffLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 120)
    private String name;

    @Column(name = "address", length = 200)
    private String address;

    @Column(name = "accepted_categories", length = 300)
    private String acceptedCategories;

    @Column(name = "opening_time", length = 10)
    private String openingTime;

    @Column(name = "closing_time", length = 10)
    private String closingTime;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;

    public DropOffLocation() {}

    public DropOffLocation(String name, String address, String acceptedCategories,
                           String openingTime, String closingTime, Double longitude, Double latitude) {
        this.name = name;
        this.address = address;
        this.acceptedCategories = acceptedCategories;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getAcceptedCategories() { return acceptedCategories; }
    public void setAcceptedCategories(String acceptedCategories) { this.acceptedCategories = acceptedCategories; }

    public String getOpeningTime() { return openingTime; }
    public void setOpeningTime(String openingTime) { this.openingTime = openingTime; }

    public String getClosingTime() { return closingTime; }
    public void setClosingTime(String closingTime) { this.closingTime = closingTime; }

    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }

    public Double getLatitude() { return latitude; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }
}
