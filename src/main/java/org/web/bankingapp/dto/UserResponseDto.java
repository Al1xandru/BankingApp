package org.web.bankingapp.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import org.web.bankingapp.entity.Account;

import java.util.ArrayList;
import java.util.List;

public class UserResponseDto {

    private Long id;
    private String username;
    private String email;
    private List<Account> accounts;

}
