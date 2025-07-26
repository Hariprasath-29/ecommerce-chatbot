package com.ecommerce.chatbot_ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class OrderItem {

    @Id
    private String id;
    private String orderId;
    private String userId;
    private String productId;
    private String inventoryItemId;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime shippedAt;
    private LocalDateTime deliveredAt;
    private LocalDateTime returnedAt;

    public OrderItem() {}

    public OrderItem(String id, String orderId, String userId, String productId, String inventoryItemId, String status,
                     LocalDateTime createdAt, LocalDateTime shippedAt, LocalDateTime deliveredAt, LocalDateTime returnedAt) {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.inventoryItemId = inventoryItemId;
        this.status = status;
        this.createdAt = createdAt;
        this.shippedAt = shippedAt;
        this.deliveredAt = deliveredAt;
        this.returnedAt = returnedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public St
