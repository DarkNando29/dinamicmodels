package com.techstack.dinamicsmodels.service.BankInformation;

import com.techstack.dinamicsmodels.models.Account;
import com.techstack.dinamicsmodels.models.BankInformation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankInformationServiceImpl implements BankInformationService{
    @Override
    public Optional<List<BankInformation>> getAll() {
        return Optional.empty();
    }

    @Override
    public Optional<BankInformation> getById() {
        return Optional.empty();
    }

    @Override
    public Optional<BankInformation> save(Account account) {
        return Optional.empty();
    }

    @Override
    public Optional<BankInformation> update(Long id, BankInformation account) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }
}
