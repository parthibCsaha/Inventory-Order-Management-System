package com.inventory.inventoryandordermanagement.dto;

import jakarta.validation.constraints.*;

public record CustomerRequest(
        @NotBlank String name,
        @Email String email,
        @NotBlank String phone,
        String address
) {}
