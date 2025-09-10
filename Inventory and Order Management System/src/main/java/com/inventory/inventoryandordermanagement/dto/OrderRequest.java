package com.inventory.inventoryandordermanagement.dto;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public record OrderRequest(
        @NotNull List<OrderItemRequest> items
) {
}
