package org.web.bankingapp.service;

import org.web.bankingapp.dto.UserCreateDto;
import org.web.bankingapp.dto.UserResponseDto;
import org.web.bankingapp.entity.User;

import java.util.List;

public interface UserService {
    
    List<UserResponseDto> getAll();
    UserResponseDto getById(Long id);
    UserResponseDto create(UserCreateDto userCreateDto);
    UserResponseDto getByUsername(String username);
    void delete(Long id);
}
