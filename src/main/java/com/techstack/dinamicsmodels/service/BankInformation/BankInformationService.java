package com.techstack.dinamicsmodels.service.BankInformation;

import com.techstack.dinamicsmodels.models.Account;
import com.techstack.dinamicsmodels.models.BankInformation;

import java.util.List;
import java.util.Optional;

public interface BankInformationService {
    Optional<List<BankInformation>> getAll();
    Optional<BankInformation> getById();
    Optional<BankInformation> save(Account account);
    Optional<BankInformation> update(Long id, BankInformation account);
    void delete(Long id);
}
