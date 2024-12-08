package org.web.bankingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.bankingapp.converter.UserCreateConverter;
import org.web.bankingapp.dto.UserCreateDto;
import org.web.bankingapp.dto.UserResponseDto;
import org.web.bankingapp.entity.User;
import org.web.bankingapp.repository.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UserCreateConverter userCreateConverter;

    @Override
    public List<UserResponseDto> getAll() {
        return usersRepository.findAll().stream()
                .map(userCreateConverter::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDto getById(Long id) {
        User user = usersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return userCreateConverter.toDto(user);
    }

    @Override
    public UserResponseDto create(UserCreateDto userCreateDto) {
        User user = userCreateConverter.toEntity(userCreateDto);
        User savedUser = usersRepository.save(user);
        return userCreateConverter.toDto(savedUser);
    }

    @Override
    public UserResponseDto getByUsername(String username) {
        User user = usersRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return userCreateConverter.toDto(user);
    }

    @Override
    public void delete(Long id) {
        if (!usersRepository.existsById(id)) {
            throw new RuntimeException("User not found");
        }
        usersRepository.deleteById(id);
    }
}
