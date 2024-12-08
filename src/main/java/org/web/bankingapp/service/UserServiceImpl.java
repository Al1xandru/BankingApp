package org.web.bankingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.bankingapp.entity.User;
import org.web.bankingapp.repository.UsersRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public List<User> getAll() {
        return usersRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return usersRepository.findById(id).get();
    }

    @Override
    public User create(User user) {
        return usersRepository.save(user);
    }

    @Override
    public User getByUsername(String username) {
        return usersRepository.findByUsername(username);
    }

    @Override
    public void delete(Long id) {
        usersRepository.deleteById(id);
    }
}
