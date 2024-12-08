package org.web.bankingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.web.bankingapp.entity.User;
import org.web.bankingapp.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll() { return userService.getAll(); }

    @PostMapping
    public User create(@RequestBody User user) { return userService.create(user); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { userService.delete(id);}
}
