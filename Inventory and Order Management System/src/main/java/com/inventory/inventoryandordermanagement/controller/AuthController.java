package com.inventory.inventoryandordermanagement.controller;

import com.inventory.inventoryandordermanagement.dto.AuthRequest;
import com.inventory.inventoryandordermanagement.dto.AuthResponse;
import com.inventory.inventoryandordermanagement.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@Valid @RequestBody AuthRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
}
