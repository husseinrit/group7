// Saif Alshamali - 410002147
package edu.rit.group7.Service;

import edu.rit.group7.Repository.RecyclingItemRepository;
import edu.rit.group7.model.RecyclingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecycleService {

    @Autowired
    private RecyclingItemRepository itemRepository;

    public List<RecyclingItem> getAll() {
        return itemRepository.findAll();
    }

    public RecyclingItem getById(Long id) {
        return itemRepository.findOneById(id);
    }

    public List<RecyclingItem> searchByName(String name) {
        return itemRepository.findByItemName(name);
    }

    public List<RecyclingItem> searchByCategory(String category) {
        return itemRepository.findByCategory(category);
    }

    public RecyclingItem add(RecyclingItem item) {
        return itemRepository.save(item);
    }

    public RecyclingItem update(Long id, RecyclingItem updated) {
        updated.setId(id);
        return itemRepository.save(updated);
    }

    @Transactional
    public void updateCategory(Long id, String category) {
        itemRepository.updateCategoryById(id, category);
    }

    public void delete(Long id) {
        itemRepository.deleteById(id);
    }
}