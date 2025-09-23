package com.inventory.inventoryandordermanagement.repo;

import com.inventory.inventoryandordermanagement.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
}
