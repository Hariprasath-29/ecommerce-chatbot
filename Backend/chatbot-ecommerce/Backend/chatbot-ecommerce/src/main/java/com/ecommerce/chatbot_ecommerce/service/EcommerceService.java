package com.ecommerce.chatbot_ecommerce.service;

import com.ecommerce.chatbot_ecommerce.model.*;
import com.ecommerce.chatbot_ecommerce.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EcommerceService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private InventoryItemRepository inventoryItemRepository;

    @Autowired
    private DistributionCenterRepository distributionCenterRepository;

    // -------------------- Product --------------------
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }

    // -------------------- User --------------------
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    // -------------------- Order --------------------
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }

    // -------------------- OrderItem --------------------
    public List<OrderItem> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    public OrderItem getOrderItemById(String id) {
        return orderItemRepository.findById(id).orElse(null);
    }

    public OrderItem saveOrderItem(OrderItem item) {
        return orderItemRepository.save(item);
    }

    public void deleteOrderItem(String id) {
        orderItemRepository.deleteById(id);
    }

    // -------------------- InventoryItem --------------------
    public List<InventoryItem> getAllInventoryItems() {
        return inventoryItemRepository.findAll();
    }

    public InventoryItem getInventoryItemById(String id) {
        return inventoryItemRepository.findById(id).orElse(null);
    }

    public InventoryItem saveInventoryItem(InventoryItem item) {
        return inventoryItemRepository.save(item);
    }

    public void deleteInventoryItem(String id) {
        inventoryItemRepository.deleteById(id);
    }

    // -------------------- DistributionCenter --------------------
    public List<DistributionCenter> getAllDistributionCenters() {
        return distributionCenterRepository.findAll();
    }

    public DistributionCenter getDistributionCenterById(String id) {
        return distributionCenterRepository.findById(id).orElse(null);
    }

    public DistributionCenter saveDistributionCenter(DistributionCenter dc) {
        return distributionCenterRepository.save(dc);
    }

    public void deleteDistributionCenter(String id) {
        distributionCenterRepository.deleteById(id);
    }
}
