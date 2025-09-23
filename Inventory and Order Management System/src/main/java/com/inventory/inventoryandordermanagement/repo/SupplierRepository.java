package com.inventory.inventoryandordermanagement.repo;

import com.inventory.inventoryandordermanagement.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
