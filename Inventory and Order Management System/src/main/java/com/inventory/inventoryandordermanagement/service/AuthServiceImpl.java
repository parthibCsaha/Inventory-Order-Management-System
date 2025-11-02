package com.inventory.inventoryandordermanagement.service.impl;

import com.inventory.inventoryandordermanagement.dto.AuthRequest;
import com.inventory.inventoryandordermanagement.dto.AuthResponse;
import com.inventory.inventoryandordermanagement.security.JwtTokenProvider;
import com.inventory.inventoryandordermanagement.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public AuthResponse login(AuthRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.username(), request.password())
        );
        String token = jwtTokenProvider.generateToken(authentication);
        String username = authentication.getName();
        String role = authentication.getAuthorities().stream().findFirst().map(Object::toString).orElse("UNKNOWN");
        return new AuthResponse(token, username, role);
    }
}
