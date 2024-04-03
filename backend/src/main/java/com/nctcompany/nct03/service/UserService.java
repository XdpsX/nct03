package com.nctcompany.nct03.service;

import com.nctcompany.nct03.dto.user.UserResponse;

public interface UserService {

    UserResponse getUserFromToken(String token);
}
