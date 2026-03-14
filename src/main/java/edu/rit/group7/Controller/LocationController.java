package edu.rit.group7.Controller;

import edu.rit.group7.Service.LocationService;
import edu.rit.group7.model.DropOffLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LocationController {

    @Autowired
    private LocationService service;

    @GetMapping("/locations")
    public String viewLocations(Model model) {

        model.addAttribute("locations", service.getLocations());

        return "locations";
    }

    @GetMapping("/locations/add")
    public String addLocationPage() {

        return "addLocation";
    }

    @PostMapping("/locations/add")
    public String addLocation(DropOffLocation location) {

        service.addLocation(location);

        return "success";
    }

}