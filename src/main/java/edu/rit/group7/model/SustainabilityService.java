package edu.rit.group7.model;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SustainabilityService {
    private List<User> users = new ArrayList<>();
    private List<RecyclingLog> logs = new ArrayList<>();

    @PostConstruct
    public void initData() {
        users.add(new User("Ahmed Ali", "+971501234567", 25, "Sharjah", "ahmed@example.com"));
        users.add(new User("Fatima Khan", "+971501234568", 30, "Dubai", "fatima@example.com"));
        users.add(new User("Omar Hassan", "+971501234569", 28, "Abu Dhabi", "omar@example.com"));

        logs.add(new RecyclingLog(1, 1, 101, 5, LocalDate.now(), 2.5, 10.0));
        logs.add(new RecyclingLog(2, 1, 102, 3, LocalDate.now(), 1.8, 6.0));
        logs.add(new RecyclingLog(3, 2, 101, 2, LocalDate.now(), 13, 1.0, 4.0));
    }

    public List<User> getAllUsers() { return users; }
    public List<RecyclingLog> getAllLogs() { return logs; }
}

