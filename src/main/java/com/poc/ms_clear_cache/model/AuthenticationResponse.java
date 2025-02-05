package com.poc.ms_clear_cache.model;

import lombok.Data;

@Data
public class AuthenticationResponse {
    private String accessToken;
    private String tokenType;
    private long expiresIn;
}