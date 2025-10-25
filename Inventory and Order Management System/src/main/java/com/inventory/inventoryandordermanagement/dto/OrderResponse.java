package com.inventory.inventoryandordermanagement.dto;

import com.inventory.inventoryandordermanagement.entity.OrderStatus;


import java.time.LocalDateTime;
import java.util.List;

public record OrderResponse(
        Long id,
        OrderStatus status,
        List<OrderItemResponse> items,
        LocalDateTime createdAt,
        Long createdBy
) {
}
