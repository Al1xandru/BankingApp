package org.web.bankingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.bankingapp.converter.UserCreateConverter;
import org.web.bankingapp.dto.UserCreateDto;
import org.web.bankingapp.dto.UserResponseDto;
import org.web.bankingapp.entity.User;
import org.web.bankingapp.exception.UserNotFoundException;
import org.web.bankingapp.repository.UsersRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<User> getAll() {
        return usersRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return usersRepository.findById(id).orElseThrow(() ->
                new UserNotFoundException("User with id " + id + " not found"));
    }

    @Override
    public User create(User user) {
        return usersRepository.save(user);
    }

    @Override
    public User getByUsername(String username) {
        return usersRepository.findByUsername(username).orElseThrow(() ->
                new UserNotFoundException("User with username " + username + " not found"));
    }

    @Override
    public void delete(Long id) {
        usersRepository.deleteById(id);
    }
}
