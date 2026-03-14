package edu.rit.group7.controller;

import edu.rit.group7.model.DropOffLocation;
import edu.rit.group7.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

    @Autowired
    private DataService service;

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