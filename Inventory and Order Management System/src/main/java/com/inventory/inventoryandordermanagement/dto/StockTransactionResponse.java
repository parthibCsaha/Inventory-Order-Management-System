package com.inventory.inventoryandordermanagement.dto;

import java.time.LocalDateTime;

public record StockTransactionResponse(
        Long id,
        Long productId,
        Integer quantityChange,
        String reason,
        Long performedBy,
        LocalDateTime timestamp
) {
}
