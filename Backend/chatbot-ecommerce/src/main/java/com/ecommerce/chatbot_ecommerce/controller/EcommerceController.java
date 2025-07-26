package com.ecommerce.chatbot_ecommerce.controller;

import com.ecommerce.chatbot_ecommerce.model.*;
import com.ecommerce.chatbot_ecommerce.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EcommerceController {

    @Autowired
    private EcommerceService ecommerceService;

    // ---------------------- Product ----------------------
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return ecommerceService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable String id) {
        return ecommerceService.getProductById(id);
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product) {
        return ecommerceService.saveProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable String id) {
        ecommerceService.deleteProduct(id);
    }

    // ---------------------- User ----------------------
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return ecommerceService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable String id) {
        return ecommerceService.getUserById(id);
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        return ecommerceService.saveUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable String id) {
        ecommerceService.deleteUser(id);
    }

    // ---------------------- Order ----------------------
    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        return ecommerceService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable String id) {
        return ecommerceService.getOrderById(id);
    }

    @PostMapping("/orders")
    public Order saveOrder(@RequestBody Order order) {
        return ecommerceService.saveOrder(order);
    }

    @DeleteMapping("/orders/{id}")
    public void deleteOrder(@PathVariable String id) {
        ecommerceService.deleteOrder(id);
    }

    // ---------------------- OrderItem ----------------------
    @GetMapping("/order-items")
    public List<OrderItem> getAllOrderItems() {
        return ecommerceService.getAllOrderItems();
    }

    @GetMapping("/order-items/{id}")
    public OrderItem getOrderItemById(@PathVariable String id) {
        return ecommerceService.getOrderItemById(id);
    }

    @PostMapping("/order-items")
    public OrderItem saveOrderItem(@RequestBody OrderItem item) {
        return ecommerceService.saveOrderItem(item);
    }

    @DeleteMapping("/order-items/{id}")
    public void deleteOrderItem(@PathVariable String id) {
        ecommerceService.deleteOrderItem(id);
    }

    // ---------------------- InventoryItem ----------------------
    @GetMapping("/inventory-items")
    public List<InventoryItem> getAllInventoryItems() {
        return ecommerceService.getAllInventoryItems();
    }

    @GetMapping("/inventory-items/{id}")
    public InventoryItem getInventoryItemById(@PathVariable String id) {
        return ecommerceService.getInventoryItemById(id);
    }

    @PostMapping("/inventory-items")
    public InventoryItem saveInventoryItem(@RequestBody InventoryItem item) {
        return ecommerceService.saveInventoryItem(item);
    }

    @DeleteMapping("/inventory-items/{id}")
    public void deleteInventoryItem(@PathVariable String id) {
        ecommerceService.deleteInventoryItem(id);
    }

    // ---------------------- DistributionCenter ----------------------
    @GetMapping("/distribution-centers")
    public List<DistributionCenter> getAllDistributionCenters() {
        return ecommerceService.getAllDistributionCenters();
    }

    @GetMapping("/distribution-centers/{id}")
    public DistributionCenter getDistributionCenterById(@PathVariable String id) {
        return ecommerceService.getDistributionCenterById(id);
    }

    @PostMapping("/distribution-centers")
    public DistributionCenter saveDistributionCenter(@RequestBody DistributionCenter dc) {
        return ecommerceService.saveDistributionCenter(dc);
    }

    @DeleteMapping("/distribution-centers/{id}")
    public void deleteDistributionCenter(@PathVariable String id) {
        ecommerceService.deleteDistributionCenter(id);
    }
}
