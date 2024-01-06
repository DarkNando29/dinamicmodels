package com.techstack.dinamicsmodels.service.Account;

import com.techstack.dinamicsmodels.models.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{
    @Override
    public Optional<List<Account>> getAll() {
        return Optional.empty();
    }

    @Override
    public Optional<Account> getById() {
        return Optional.empty();
    }

    @Override
    public Optional<Account> save(Account account) {
        return Optional.empty();
    }

    @Override
    public Optional<Account> update(Long id, Account account) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }
}
