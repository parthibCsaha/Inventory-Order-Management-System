package com.inventory.inventoryandordermanagement.mapper;

import com.inventory.inventoryandordermanagement.dto.OrderItemRequest;
import com.inventory.inventoryandordermanagement.dto.OrderItemResponse;
import com.inventory.inventoryandordermanagement.entity.OrderItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {

    OrderItem toEntity(OrderItemRequest dto);
    OrderItemResponse toResponse(OrderItem entity);

}
