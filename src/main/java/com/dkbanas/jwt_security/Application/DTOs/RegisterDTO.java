package com.dkbanas.jwt_security.Application.DTOs;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class RegisterDTO {
    private String fullname;
    private String email;
    private String password;
    private List<String> authorities;
}
