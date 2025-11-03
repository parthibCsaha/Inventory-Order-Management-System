package com.inventory.inventoryandordermanagement.mapper;

import com.inventory.inventoryandordermanagement.dto.ProductRequest;
import com.inventory.inventoryandordermanagement.dto.ProductResponse;
import com.inventory.inventoryandordermanagement.entity.Product;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toEntity(ProductRequest dto);
    ProductResponse toResponse(Product entity);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(ProductRequest dto, @MappingTarget Product entity);

}
