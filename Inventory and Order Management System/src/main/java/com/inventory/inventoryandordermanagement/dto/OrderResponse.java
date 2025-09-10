package com.inventory.inventoryandordermanagement.dto;

import com.inventory.inventoryandordermanagement.entity.OrderStatus;

import java.time.Instant;
import java.util.List;

public record OrderResponse(
        Long id,
        OrderStatus status,
        List<OrderItemResponse> items,
        Instant createdAt,
        Long createdBy
) {
}
