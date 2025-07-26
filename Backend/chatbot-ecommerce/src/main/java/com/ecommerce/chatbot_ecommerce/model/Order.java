package com.ecommerce.chatbot_ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Order {

    @Id
    private String orderId;
    private String userId;
    private String status;
    private String gender;
    private LocalDateTime createdAt;
    private LocalDateTime returnedAt;
    private LocalDateTime shippedAt;
    private LocalDateTime deliveredAt;
    private int numOfItem;

    public Order() {}

    public Order(String orderId, String userId, String status, String gender, LocalDateTime createdAt,
                 LocalDateTime returnedAt, LocalDateTime shippedAt, LocalDateTime deliveredAt, int numOfItem) {
        this.orderId = orderId;
        this.userId = userId;
        this.status = status;
        this.gender = gender;
        this.createdAt = createdAt;
        this.returnedAt = returnedAt;
        this.shippedAt = shippedAt;
        this.deliveredAt = deliveredAt;
        this.numOfItem = numOfItem;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getReturnedAt() {
        return returnedAt;
    }

    public void setReturnedAt(LocalDateTime returnedAt) {
        this.returnedAt = returnedAt;
    }

    public LocalDateTime getShippedAt() {
        return shippedAt;
    }

    public void setShippedAt(LocalDateTime shippedAt) {
        this.shippedAt = shippedAt;
    }

    public LocalDateTime getDeliveredAt() {
        return deliveredAt;
    }

    public void setDeliveredAt(LocalDateTime deliveredAt) {
        this.deliveredAt = deliveredAt;
    }

    public int getNumOfItem() {
        return numOfItem;
    }

    public void setNumOfItem(int numOfItem) {
        this.numOfItem = numOfItem;
    }
}
    