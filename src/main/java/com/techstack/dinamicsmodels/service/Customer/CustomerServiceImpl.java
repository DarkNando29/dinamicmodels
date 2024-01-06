package com.techstack.dinamicsmodels.service.Customer;

import com.techstack.dinamicsmodels.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public Optional<List<Customer>> getAll() {
        return Optional.empty();
    }

    @Override
    public Optional<Customer> getById() {
        return Optional.empty();
    }

    @Override
    public Optional<Customer> save(Customer account) {
        return Optional.empty();
    }

    @Override
    public Optional<Customer> update(Long id, Customer account) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }
}
