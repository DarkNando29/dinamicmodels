package com.techstack.dinamicsmodels.service.Customer;

import com.techstack.dinamicsmodels.models.Account;
import com.techstack.dinamicsmodels.models.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Optional<List<Customer>> getAll();
    Optional<Customer> getById();
    Optional<Customer> save(Customer account);
    Optional<Customer> update(Long id,Customer account);
    void delete(Long id);
}
