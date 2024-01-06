package com.techstack.dinamicsmodels.service.Account;

import com.techstack.dinamicsmodels.models.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    //get
    Optional<List<Account>> getAll();
    Optional<Account> getById();
    Optional<Account> save(Account account);
    Optional<Account> update(Long id,Account account);
    void delete(Long id);
}
