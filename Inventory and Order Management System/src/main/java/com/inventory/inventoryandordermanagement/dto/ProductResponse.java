package com.inventory.inventoryandordermanagement.dto;

import java.math.BigDecimal;

public record ProductResponse(
        Long id,
        String sku,
        String name,
        String description,
        BigDecimal price,
        int stockQuantity,
        int reorderLevel,
        Long supplierId
) {
}
