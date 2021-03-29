package com.seltius.blog.service.api;

import com.seltius.blog.model.request.AuthRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {

    ResponseEntity<?> authenticate(AuthRequest request);

}
