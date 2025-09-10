package com.inventory.inventoryandordermanagement.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record ProductRequest(

        @NotBlank String sku, // sku - stock keeping unit
        @NotBlank String name,
        String description,
        @Positive BigDecimal price,
        @PositiveOrZero int stockQuantity,
        @PositiveOrZero int reorderLevel,
        Long supplierId

) {}
