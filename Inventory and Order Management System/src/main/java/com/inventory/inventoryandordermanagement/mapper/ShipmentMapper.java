package com.inventory.inventoryandordermanagement.mapper;

import com.inventory.inventoryandordermanagement.dto.ShipmentDto;
import com.inventory.inventoryandordermanagement.entity.Shipment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShipmentMapper {
    ShipmentDto toDto(Shipment shipment);
    Shipment toEntity(ShipmentDto dto);
}
