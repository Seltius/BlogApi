package com.seltius.blog.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;

public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //TODO GET USERNAME/PASSWORD FROM DB (DAO IMPLEMENTATION)
        if ("seltius".equals(username)) {
            return new User("seltius", "$2a$10$.QF2.8DOijmkSgraTrqdseROSTjf6ZDQt9cnZPg4FpDrQmQHJcEYi",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
