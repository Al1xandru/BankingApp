package org.web.bankingapp.converter;

import org.springframework.stereotype.Component;
import org.web.bankingapp.dto.UserCreateDto;
import org.web.bankingapp.dto.UserResponseDto;
import org.web.bankingapp.entity.Account;
import org.web.bankingapp.entity.User;

@Component
public class UserCreateConverter implements Converter<User, UserCreateDto, UserResponseDto> {

    @Override
    public UserResponseDto toDto(User user) {
        return new UserResponseDto(user.getId(), user.getUsername(), user.getEmail(), user.getAccounts());
    }

    @Override
    public User toEntity(UserCreateDto userCreateDto) {
        return new User(userCreateDto.getUsername(), userCreateDto.getEmail(), userCreateDto.getPassword());
    }
}
