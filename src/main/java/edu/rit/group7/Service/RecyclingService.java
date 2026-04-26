// Naren Karthik - 746009107
package edu.rit.group7.Service;

import edu.rit.group7.Repository.RecyclingLogRepository;
import edu.rit.group7.model.RecyclingLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecyclingService {

    @Autowired
    private RecyclingLogRepository logRepository;

    public List<RecyclingLog> getAllLogs() {
        return logRepository.findAll();
    }

    public RecyclingLog getById(Long id) {
        return logRepository.findOneById(id);
    }

    public List<RecyclingLog> searchByUserId(Long userId) {
        return logRepository.findByUserId(userId);
    }

    public List<RecyclingLog> searchByItemId(Long itemId) {
        return logRepository.findByItemId(itemId);
    }

    public RecyclingLog addLog(RecyclingLog log) {
        return logRepository.save(log);
    }

    public RecyclingLog update(Long id, RecyclingLog updated) {
        updated.setId(id);
        return logRepository.save(updated);
    }

    @Transactional
    public void updateQuantity(Long id, int quantity) {
        logRepository.updateQuantityById(id, quantity);
    }

    public void delete(Long id) {
        logRepository.deleteById(id);
    }
}
