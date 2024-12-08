package org.web.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.bankingapp.entity.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
