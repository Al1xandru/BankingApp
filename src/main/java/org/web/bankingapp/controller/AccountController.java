package org.web.bankingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web.bankingapp.dto.AccountDto;
import org.web.bankingapp.entity.Account;
import org.web.bankingapp.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public AccountDto create(@RequestBody AccountDto request) {
        Account account = new Account();
        account.setAccountNumber(request.getAccountNumber());
        account.setBalance(request.getBalance());
        Account tempAcc = accountService.create(account, request.getUserId());
        return new AccountDto(tempAcc.getAccountNumber(), tempAcc.getBalance(), tempAcc.getId());
    }
}
