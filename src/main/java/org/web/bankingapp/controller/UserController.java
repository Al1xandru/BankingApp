package org.web.bankingapp.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.web.bankingapp.dto.UserCreateDto;
import org.web.bankingapp.dto.UserResponseDto;
import org.web.bankingapp.entity.User;
import org.web.bankingapp.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAll() {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable Long id) {
        return null;
    }

    @GetMapping("/search")
    public ResponseEntity<UserResponseDto> getUserByUsername(@RequestParam String username) {
        return null;
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> create(@RequestBody @Valid UserCreateDto userCreateDto) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        return null;
    }
}
