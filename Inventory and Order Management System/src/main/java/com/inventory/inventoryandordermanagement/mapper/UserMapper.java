package com.inventory.inventoryandordermanagement.mapper;

import com.inventory.inventoryandordermanagement.dto.UserRequest;
import com.inventory.inventoryandordermanagement.dto.UserResponse;
import com.inventory.inventoryandordermanagement.entity.User;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserRequest dto);

    UserResponse toResponse(User entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(UserRequest dto, @MappingTarget User entity);
}
