// mapper/OutboxEventMapper.java
package com.inventory.inventoryandordermanagement.mapper;

import com.inventory.inventoryandordermanagement.dto.OutboxEventDto;
import com.inventory.inventoryandordermanagement.entity.OutboxEvent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OutboxEventMapper {
    OutboxEventDto toDto(OutboxEvent outboxEvent);
    OutboxEvent toEntity(OutboxEventDto dto);
}
