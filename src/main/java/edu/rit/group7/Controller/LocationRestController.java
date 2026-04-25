// Hussein Al Salami - 746006849
package edu.rit.group7.Controller;

import edu.rit.group7.Service.LocationService;
import edu.rit.group7.model.DropOffLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationRestController {

    @Autowired
    private LocationService locationService;

    @GetMapping
    public ResponseEntity<List<DropOffLocation>> getAll() {
        return ResponseEntity.ok(locationService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DropOffLocation> getById(@PathVariable Long id) {
        DropOffLocation location = locationService.getById(id);
        if (location == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(location);
    }

    @GetMapping("/search")
    public ResponseEntity<List<DropOffLocation>> search(@RequestParam String name) {
        return ResponseEntity.ok(locationService.searchByName(name));
    }

    @PostMapping
    public ResponseEntity<DropOffLocation> create(@RequestBody DropOffLocation location) {
        DropOffLocation saved = locationService.add(location);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DropOffLocation> update(@PathVariable Long id, @RequestBody DropOffLocation location) {
        DropOffLocation existing = locationService.getById(id);
        if (existing == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(locationService.update(id, location));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        DropOffLocation existing = locationService.getById(id);
        if (existing == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        locationService.delete(id);
        return ResponseEntity.ok().build();
    }
}
