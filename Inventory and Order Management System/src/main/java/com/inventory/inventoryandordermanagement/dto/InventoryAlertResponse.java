package com.inventory.inventoryandordermanagement.dto;

import java.time.LocalDateTime;

public record InventoryAlertResponse(
        Long id,
        Long productId,
        Integer threshold,
        Boolean active,
        LocalDateTime createdAt,
        LocalDateTime resolvedAt
) {
}
