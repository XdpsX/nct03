package com.nctcompany.nct03.service.impl;

import com.nctcompany.nct03.dto.user.UserResponse;
import com.nctcompany.nct03.exception.ResourceNotFoundException;
import com.nctcompany.nct03.mapper.UserMapper;
import com.nctcompany.nct03.model.User;
import com.nctcompany.nct03.repository.UserRepository;
import com.nctcompany.nct03.security.JwtService;
import com.nctcompany.nct03.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final JwtService jwtService;
    private final UserRepository userRepository;

    @Override
    public UserResponse getUserFromToken(String token) {
        String email = jwtService.extractUsername(token);
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("User with email=[%s] not found".formatted(email)));

        return UserMapper.mapToResponse(user);
    }
}
