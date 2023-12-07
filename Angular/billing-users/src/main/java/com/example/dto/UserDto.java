package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private  String firstName;
    private String lastName;
    private String userName;
    private String email;
//    private String role;
    private String password;
    private String roles;
    private boolean isActive;
}
