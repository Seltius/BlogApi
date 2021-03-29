package com.seltius.blog.service.impl;

import com.seltius.blog.model.request.AuthRequest;
import com.seltius.blog.service.api.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public ResponseEntity<?> authenticate(AuthRequest request) {

        return null;

    }

}
