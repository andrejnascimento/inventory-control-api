package com.api.inventorycontrol.repository;

import com.api.inventorycontrol.model.InventoryModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepository  extends MongoRepository<InventoryModel, String> {
}
