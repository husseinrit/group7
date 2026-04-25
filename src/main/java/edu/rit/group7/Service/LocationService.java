// Hussein Al Salami - 746006849
package edu.rit.group7.Service;

import edu.rit.group7.Repository.DropOffLocationRepository;
import edu.rit.group7.model.DropOffLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private DropOffLocationRepository locationRepository;

    public List<DropOffLocation> getAll() {
        return locationRepository.findAll();
    }

    public DropOffLocation getById(Long id) {
        return locationRepository.findOneById(id);
    }

    public List<DropOffLocation> searchByName(String name) {
        return locationRepository.findByName(name);
    }

    public List<DropOffLocation> searchByAddress(String keyword) {
        return locationRepository.findByAddressContaining(keyword);
    }

    public DropOffLocation add(DropOffLocation location) {
        return locationRepository.save(location);
    }

    public DropOffLocation update(Long id, DropOffLocation updated) {
        updated.setId(id);
        return locationRepository.save(updated);
    }

    @Transactional
    public void updateName(Long id, String name) {
        locationRepository.updateNameById(id, name);
    }

    public void delete(Long id) {
        locationRepository.deleteById(id);
    }
}