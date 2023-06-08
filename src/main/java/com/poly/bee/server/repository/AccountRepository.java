package com.poly.bee.server.repository;

import com.poly.bee.server.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(AccountRepository.NAME)
public interface AccountRepository extends JpaRepository<Account, String> {
    public static final String NAME = "BaseAccountRepository";
}
