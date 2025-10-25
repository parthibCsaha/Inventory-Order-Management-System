// dto/OutboxEventDto.java
package com.inventory.inventoryandordermanagement.dto;

import java.time.Instant;

public record OutboxEventDto(
        Long id,
        String aggregateType,
        Long aggregateId,
        String eventType,
        String payload,
        String status,   // Enum as String
        Instant createdAt
) {}
