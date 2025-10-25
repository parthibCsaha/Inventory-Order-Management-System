package com.inventory.inventoryandordermanagement.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record StockTransactionRequest (

    @NotNull Long productId,
    @NotNull Integer quantityChange,
    @NotBlank
    String reason,
    @NotNull Long performedBy

) {}
