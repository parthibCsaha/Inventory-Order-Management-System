package com.inventory.inventoryandordermanagement.repo;

import com.inventory.inventoryandordermanagement.entity.OutboxEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutboxEventRepository extends JpaRepository<OutboxEvent, Long> {
}
