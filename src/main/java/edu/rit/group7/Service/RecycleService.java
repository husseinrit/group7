package edu.rit.group7.Service;

import edu.rit.group7.model.RecyclingItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecycleService {

    private List<RecyclingItem> items = new ArrayList<>();

    public RecycleService() {

        RecyclingItem r1 = new RecyclingItem();
        r1.setItemId(1);
        r1.setItemName("Plastic Bottle");
        r1.setCategory("Plastic");
        r1.setRecyclable(true);

        RecyclingItem r2 = new RecyclingItem();
        r2.setItemId(2);
        r2.setItemName("Aluminum Can");
        r2.setCategory("Metal");
        r2.setRecyclable(true);

        items.add(r1);
        items.add(r2);
    }

    public List<RecyclingItem> getItems() {
        return items;
    }

    public void addItem(RecyclingItem item) {
        items.add(item);
    }
}