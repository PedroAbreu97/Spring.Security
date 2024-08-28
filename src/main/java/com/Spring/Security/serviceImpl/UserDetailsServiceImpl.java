package com.Spring.Security.serviceImpl;


import lombok.AllArgsConstructor;
import com.Spring.Security.repository.UserRepository;
import com.Spring.Security.service.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
	

    private final UserRepository userRepository;

    @Override
    public UserDetails loadByUsername(String userEmail) {
        return userRepository
                .findByEmail(userEmail)
                .orElseThrow();
    }

}
