
// Saif Alshamali - 410002147
package edu.rit.group7.model;

import jakarta.persistence.*;

    @Entity
    @Table(name = "recycling_item")
    public class RecyclingItem {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "item_name", nullable = false, length = 120)
        private String itemName;

        @Column(name = "category", length = 80)
        private String category;

        @Column(name = "is_recyclable")
        private boolean isRecyclable;

        @Column(name = "preparation_steps", length = 500)
        private String preparationSteps;

        @Column(name = "common_mistakes", length = 500)
        private String commonMistakes;

        @Column(name = "notes", length = 300)
        private String notes;

        public RecyclingItem() {}

        public RecyclingItem(String itemName, String category, boolean isRecyclable,
                             String preparationSteps, String commonMistakes, String notes) {
            this.itemName = itemName;
            this.category = category;
            this.isRecyclable = isRecyclable;
            this.preparationSteps = preparationSteps;
            this.commonMistakes = commonMistakes;
            this.notes = notes;
        }

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getItemName() { return itemName; }
        public void setItemName(String itemName) { this.itemName = itemName; }

        public String getCategory() { return category; }
        public void setCategory(String category) { this.category = category; }

        public boolean isRecyclable() { return isRecyclable; }
        public void setRecyclable(boolean recyclable) { isRecyclable = recyclable; }

        public String getPreparationSteps() { return preparationSteps; }
        public void setPreparationSteps(String preparationSteps) { this.preparationSteps = preparationSteps; }

        public String getCommonMistakes() { return commonMistakes; }
        public void setCommonMistakes(String commonMistakes) { this.commonMistakes = commonMistakes; }

        public String getNotes() { return notes; }
        public void setNotes(String notes) { this.notes = notes; }
    }