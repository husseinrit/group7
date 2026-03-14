package edu.rit.group7.Service;
import edu.rit.group7.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SustainabilityService {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {   // ← must exist, public, same name
        users.add(user);
    }

    @PostConstruct
    public void initData() {
        users.add(new User("Ahmed Ali", "+971501234567", 25, "Sharjah", "ahmed@example.com"));
        users.add(new User("Fatima Khan", "+971501234568", 30, "Dubai", "fatima@example.com"));
        users.add(new User("Omar Hassan", "+971501234569", 28, "Abu Dhabi", "omar@example.com"));

    }

    public List<User> getAllUsers() { return users; }
}

