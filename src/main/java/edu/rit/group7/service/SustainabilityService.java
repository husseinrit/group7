package edu.rit.group7.service;

import edu.rit.group7.model.RecyclingItem;
import edu.rit.group7.model.RecyclingLog;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SustainabilityService {

    private List<RecyclingItem> items = new ArrayList<>();
    private List<RecyclingLog> logs = new ArrayList<>();

    @PostConstruct
    public void initData() {
        items.add(new RecyclingItem(
                101,
                "Plastic Bottle",
                "Plastic",
                true,
                "Clean before recycling",
                "Leaving liquid inside",
                "PET plastic bottle"
        ));

        items.add(new RecyclingItem(
                102,
                "Cardboard Box",
                "Paper",
                true,
                "Fold the box",
                "Leaving tape attached",
                "Remove non-paper material"
        ));


        logs.add(new RecyclingLog(1, 1, 101, 5, LocalDate.now(), 2.5, 1.2));
        logs.add(new RecyclingLog(2, 1, 102, 3, LocalDate.now(), 1.8, 2.0));

    }

    public List<RecyclingItem> getAllItems() {
        return items;
    }

    public List<RecyclingLog> getAllLogs() {
        return logs;
    }

    public void addLog(RecyclingLog log) {
        logs.add(log);
    }

    public RecyclingItem findItemById(int itemId) {
        for (RecyclingItem item : items) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }
}