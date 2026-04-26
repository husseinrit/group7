// Naren Karthik - 746009107
package edu.rit.group7.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "recycling_log")
public class RecyclingLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "estimated_co2_saved")
    private double estimatedCO2Saved;

    @Column(name = "diverted_from_landfill_kg")
    private double divertedFromLandfillKg;

    public RecyclingLog() {}

    public RecyclingLog(Long userId, Long itemId, int quantity, LocalDate date,
                        double estimatedCO2Saved, double divertedFromLandfillKg) {
        this.userId = userId;
        this.itemId = itemId;
        this.quantity = quantity;
        this.date = date;
        this.estimatedCO2Saved = estimatedCO2Saved;
        this.divertedFromLandfillKg = divertedFromLandfillKg;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Long getItemId() { return itemId; }
    public void setItemId(Long itemId) { this.itemId = itemId; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public double getEstimatedCO2Saved() { return estimatedCO2Saved; }
    public void setEstimatedCO2Saved(double estimatedCO2Saved) { this.estimatedCO2Saved = estimatedCO2Saved; }

    public double getDivertedFromLandfillKg() { return divertedFromLandfillKg; }
    public void setDivertedFromLandfillKg(double divertedFromLandfillKg) { this.divertedFromLandfillKg = divertedFromLandfillKg; }
}
