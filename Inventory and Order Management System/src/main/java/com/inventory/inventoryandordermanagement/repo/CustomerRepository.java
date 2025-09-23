package com.inventory.inventoryandordermanagement.repo;

import com.inventory.inventoryandordermanagement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
