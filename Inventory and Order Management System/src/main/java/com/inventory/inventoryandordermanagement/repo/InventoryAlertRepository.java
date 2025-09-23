package com.inventory.inventoryandordermanagement.repo;

import com.inventory.inventoryandordermanagement.entity.InventoryAlert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryAlertRepository extends JpaRepository<InventoryAlert, Long> {
}
