package org.web.bankingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.bankingapp.entity.Account;
import org.web.bankingapp.entity.User;
import org.web.bankingapp.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private UserService userService;

    @Override
    public Account create(Account account, String username) {
        User user = userService.getByUsername(username);
        user.addAccount(account);
        accountRepository.save(account);
        return account;
    }

    @Override
    public void delete(Long id) {
        //
    }

    @Override
    public Account getByUser(String username) {
        return null;
    }
}
