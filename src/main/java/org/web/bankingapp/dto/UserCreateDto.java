package org.web.bankingapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.web.bankingapp.validation.ValidPassword;

public class UserCreateDto {

    @NotBlank(message = "Username is required")
    @Size(min = 5, max = 10, message = "Username must be between 5 and 10 characters")
    private String username;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters")
    @ValidPassword
    private String password;

}
