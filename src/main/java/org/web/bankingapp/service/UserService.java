package org.web.bankingapp.service;

import org.web.bankingapp.entity.User;

import java.util.List;

public interface UserService {
    
    List<User> getAll();
    User getById(Long id);
    User create(User user);
    User getByUsername(String username);
    void delete(Long id);
}
