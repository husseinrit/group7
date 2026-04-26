// Saif Alshamali - 410002147
package edu.rit.group7.Controller;

import edu.rit.group7.Service.RecycleService;
import edu.rit.group7.model.RecyclingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class RecyclingItemController {

    @Autowired
    private RecycleService recycleService;

    @GetMapping
    public ResponseEntity<List<RecyclingItem>> getAll() {
        return ResponseEntity.ok(recycleService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecyclingItem> getById(@PathVariable Long id) {
        RecyclingItem item = recycleService.getById(id);
        if (item == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(item);
    }

    @GetMapping("/search")
    public ResponseEntity<List<RecyclingItem>> search(@RequestParam String name) {
        return ResponseEntity.ok(recycleService.searchByName(name));
    }

    @PostMapping
    public ResponseEntity<RecyclingItem> create(@RequestBody RecyclingItem item) {
        RecyclingItem saved = recycleService.add(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecyclingItem> update(@PathVariable Long id, @RequestBody RecyclingItem item) {
        RecyclingItem existing = recycleService.getById(id);
        if (existing == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(recycleService.update(id, item));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        RecyclingItem existing = recycleService.getById(id);
        if (existing == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        recycleService.delete(id);
        return ResponseEntity.ok().build();
    }
}
