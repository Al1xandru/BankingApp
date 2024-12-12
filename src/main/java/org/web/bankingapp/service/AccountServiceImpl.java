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

    public Account create(Account account, Long userId) {
        User user = userService.getById(userId);
        account.setUser(user);
        return accountRepository.save(account);
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
