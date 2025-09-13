package com.inventory.inventoryandordermanagement.dto;

import jakarta.validation.constraints.*;

public record SupplierRequest(
        @NotBlank String name,
        @Email String email,
        @NotBlank String phone,
        String address
) {}
