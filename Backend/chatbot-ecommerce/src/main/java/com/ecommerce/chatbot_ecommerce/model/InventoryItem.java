package com.ecommerce.chatbot_ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class InventoryItem {

    @Id
    private String id;
    private String productId;
    private LocalDateTime createdAt;
    private LocalDateTime soldAt;
    private double cost;
    private String productCategory;
    private String productName;
    private String productBrand;
    private double productRetailPrice;
    private String productDepartment;
    private String productSku;
    private String productDistributionCenterId;

    public InventoryItem() {}

    public InventoryItem(String id, String productId, LocalDateTime createdAt, LocalDateTime soldAt, double cost,
                         String productCategory, String productName, String productBrand, double productRetailPrice,
                         String productDepartment, String productSku, String productDistributionCenterId) {
        this.id = id;
        this.productId = productId;
        this.createdAt = createdAt;
        this.soldAt = soldAt;
        this.cost = cost;
        this.productCategory = productCategory;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productRetailPrice = productRetailPrice;
        this.productDepartment = productDepartment;
        this.productSku = productSku;
        this.productDistributionCenterId = productDistributionCenterId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getSoldAt() {
        return soldAt;
    }

    public void setSoldAt(LocalDateTime soldAt) {
        this.soldAt = soldAt;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.
