package org.web.bankingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web.bankingapp.dto.AccountCreationRequest;
import org.web.bankingapp.entity.Account;
import org.web.bankingapp.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public Account create(@RequestBody AccountCreationRequest request) {
        Account account = new Account();
        account.setAccountNumber(request.getAccountNumber());
        account.setBalance(request.getBalance());
        return accountService.create(account, request.getUsername());
    }
}
