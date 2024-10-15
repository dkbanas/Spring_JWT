package com.dkbanas.jwt_security.Application.Responses;

import lombok.Getter;

import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    private String token;
    private long expiresIn;
}
