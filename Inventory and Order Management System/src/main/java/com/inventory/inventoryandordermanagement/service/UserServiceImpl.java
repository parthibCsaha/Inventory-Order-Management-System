package com.inventory.inventoryandordermanagement.service;

import com.inventory.inventoryandordermanagement.dto.UserRequest;
import com.inventory.inventoryandordermanagement.dto.UserResponse;
import com.inventory.inventoryandordermanagement.entity.User;
import com.inventory.inventoryandordermanagement.exception.ResourceNotFoundException;
import com.inventory.inventoryandordermanagement.mapper.UserMapper;
import com.inventory.inventoryandordermanagement.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponse createUser(UserRequest userRequest) {
        User user = userMapper.toEntity(userRequest);
        return userMapper.toResponse(userRepository.save(user));
    }

    public UserResponse getUserById(Long userId) {
        return userRepository.findById(userId)
                .map(userMapper::toResponse)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + userId));
    }

    public List<UserResponse> getAllUsers() {
        return userRepository.findAll().stream().map(userMapper::toResponse).toList();
    }

    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new ResourceNotFoundException("User not found with id " + id);
        }
        userRepository.deleteById(id);
    }

}
