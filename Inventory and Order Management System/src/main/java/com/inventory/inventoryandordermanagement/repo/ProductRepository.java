package com.inventory.inventoryandordermanagement.repo;

import com.inventory.inventoryandordermanagement.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findBySku(String sku);
    boolean existsByName(String name);
}
