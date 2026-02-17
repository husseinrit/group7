package edu.rit.group7.model;

import org.springframework.stereotype.Component;

@Component
public class RecyclingItem {
    private int itemId;
    private String itemName;
    private String category;
    private boolean isRecyclable;
    private String preparationSteps;
    private String commonMistakes;
    private String notes;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isRecyclable() {
        return isRecyclable;
    }

    public void setRecyclable(boolean recyclable) {
        isRecyclable = recyclable;
    }


    public String getPreparationSteps() {
        return preparationSteps;
    }

    public void setPreparationSteps(String preparationSteps) {
        this.preparationSteps = preparationSteps;
    }


    public String getCommonMistakes() {
        return commonMistakes;
    }

    public void setCommonMistakes(String commonMistakes) {
        this.commonMistakes = commonMistakes;
    }


    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
