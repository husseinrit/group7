package edu.rit.group7.Service;

import edu.rit.group7.model.DropOffLocation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    private List<DropOffLocation> locations = new ArrayList<>();

    public LocationService() {

        DropOffLocation l1 = new DropOffLocation();
        l1.setLocationId(1);
        l1.setName("Dubai Recycling Center");
        l1.setAddress("Dubai Marina");
        l1.setOpeningTime("08:00");
        l1.setClosingTime("20:00");

        locations.add(l1);
    }

    public List<DropOffLocation> getLocations() {
        return locations;
    }

    public void addLocation(DropOffLocation location) {
        locations.add(location);
    }
}