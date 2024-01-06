package com.techstack.dinamicsmodels.service.Address;

import com.techstack.dinamicsmodels.models.Account;
import com.techstack.dinamicsmodels.models.Address;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService{
    @Override
    public Optional<List<Address>> getAll() {
        return Optional.empty();
    }

    @Override
    public Optional<Address> getById() {
        return Optional.empty();
    }

    @Override
    public Optional<Address> save(Account account) {
        return Optional.empty();
    }

    @Override
    public Optional<Address> update(Long id, Address account) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }
}
