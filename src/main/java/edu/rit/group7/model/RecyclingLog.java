package edu.rit.group7.model;

import java.time.LocalDate;

public class RecyclingLog {

    private int logId;
    private int userId;
    private int itemId;
    private int quantity;
    private LocalDate date;
    private double estimatedCO2Saved;
    private double divertedFromLandfillKg;

    public RecyclingLog() {
    }

    public RecyclingLog(int logId, int userId, int itemId, int quantity, LocalDate date, double estimatedCO2Saved, double divertedFromLandfillKg) {
        this.logId = logId;
        this.userId = userId;
        this.itemId = itemId;
        this.quantity = quantity;
        this.date = date;
        this.estimatedCO2Saved = estimatedCO2Saved;
        this.divertedFromLandfillKg = divertedFromLandfillKg;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getEstimatedCO2Saved() {
        return estimatedCO2Saved;
    }

    public void setEstimatedCO2Saved(double estimatedCO2Saved) {
        this.estimatedCO2Saved = estimatedCO2Saved;
    }

    public double getDivertedFromLandfillKg() {
        return divertedFromLandfillKg;
    }

    public void setDivertedFromLandfillKg(double divertedFromLandfillKg) {
        this.divertedFromLandfillKg = divertedFromLandfillKg;
    }
}