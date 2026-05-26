package com.example.breatheesg.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "emission_record")
public class EmissionRecord {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sourceType;

    private String category;

    private String activityType;

    private Double amount;

    private String unit;

    private Double normalizedAmount;

    private String normalizedUnit;

    private String emissionScope;

    private String status;

    @Column(length = 5000)
    private String rawData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getNormalizedAmount() {
        return normalizedAmount;
    }

    public void setNormalizedAmount(Double normalizedAmount) {
        this.normalizedAmount = normalizedAmount;
    }

    public String getNormalizedUnit() {
        return normalizedUnit;
    }

    public void setNormalizedUnit(String normalizedUnit) {
        this.normalizedUnit = normalizedUnit;
    }

    public String getEmissionScope() {
        return emissionScope;
    }

    public void setEmissionScope(String emissionScope) {
        this.emissionScope = emissionScope;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRawData() {
        return rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }
}
