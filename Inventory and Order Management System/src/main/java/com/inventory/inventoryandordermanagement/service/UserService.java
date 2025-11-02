package com.inventory.inventoryandordermanagement.service;

import com.inventory.inventoryandordermanagement.dto.UserRequest;
import com.inventory.inventoryandordermanagement.dto.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest dto);
    UserResponse getUserById(Long id);
    List<UserResponse> getAllUsers();
    void deleteUser(Long id);

}
