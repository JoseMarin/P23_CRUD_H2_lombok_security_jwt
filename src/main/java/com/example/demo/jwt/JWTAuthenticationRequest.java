package com.example.demo.jwt;

import lombok.Data;

/**
 * @author Jose Marin
 */

@Data
public class JWTAuthenticationRequest {
    private String userName;
    private String password;
}