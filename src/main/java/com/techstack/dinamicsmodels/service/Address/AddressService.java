package com.techstack.dinamicsmodels.service.Address;

import com.techstack.dinamicsmodels.models.Account;
import com.techstack.dinamicsmodels.models.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    Optional<List<Address>> getAll();
    Optional<Address> getById();
    Optional<Address> save(Account account);
    Optional<Address> update(Long id,Address account);
    void delete(Long id);
}
