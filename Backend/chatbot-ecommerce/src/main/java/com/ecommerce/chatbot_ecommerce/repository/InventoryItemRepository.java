package com.ecommerce.chatbot_ecommerce.repository;

import com.ecommerce.chatbot_ecommerce.model.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryItemRepository extends JpaRepository<InventoryItem, String> {
}
