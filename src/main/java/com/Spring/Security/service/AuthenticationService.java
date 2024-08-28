package com.Spring.Security.service;

import com.Spring.Security.dto.request.AuthenticationRequest;
import com.Spring.Security.dto.request.RegisterRequest;
import com.Spring.Security.dto.response.AuthenticationResponse;

public interface AuthenticationService {

    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);

}

