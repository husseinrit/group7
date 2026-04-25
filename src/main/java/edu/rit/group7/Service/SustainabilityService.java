// Hussein Al Salami - 746006849
package edu.rit.group7.Service;

import edu.rit.group7.Repository.UserRepository;
import edu.rit.group7.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SustainabilityService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getById(Long id) {
        return userRepository.findOneById(id);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> findByCity(String city) {
        return userRepository.findByCity(city);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User update(Long id, User updated) {
        updated.setId(id);
        return userRepository.save(updated);
    }

    @Transactional
    public void updateCity(Long id, String city) {
        userRepository.updateCityById(id, city);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
