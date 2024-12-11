package org.web.bankingapp.service;

import org.web.bankingapp.entity.Account;

public interface AccountService {

    Account create(Account account, String username);
    void delete(Long id);
    Account getByUser(String username);

}
