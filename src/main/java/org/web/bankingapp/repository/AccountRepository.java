package org.web.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.bankingapp.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
