// Naren Karthik - 746009107
package edu.rit.group7.Controller;

import edu.rit.group7.Service.RecyclingService;
import edu.rit.group7.model.RecyclingLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class RecyclingLogController {

    @Autowired
    private RecyclingService recyclingService;

    @GetMapping
    public ResponseEntity<List<RecyclingLog>> getAll() {
        return ResponseEntity.ok(recyclingService.getAllLogs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecyclingLog> getById(@PathVariable Long id) {
        RecyclingLog log = recyclingService.getById(id);
        if (log == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(log);
    }

    @GetMapping("/search")
    public ResponseEntity<List<RecyclingLog>> search(@RequestParam Long userId) {
        return ResponseEntity.ok(recyclingService.searchByUserId(userId));
    }

    @PostMapping
    public ResponseEntity<RecyclingLog> create(@RequestBody RecyclingLog log) {
        RecyclingLog saved = recyclingService.addLog(log);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecyclingLog> update(@PathVariable Long id, @RequestBody RecyclingLog log) {
        RecyclingLog existing = recyclingService.getById(id);
        if (existing == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(recyclingService.update(id, log));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        RecyclingLog existing = recyclingService.getById(id);
        if (existing == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        recyclingService.delete(id);
        return ResponseEntity.ok().build();
    }
}
