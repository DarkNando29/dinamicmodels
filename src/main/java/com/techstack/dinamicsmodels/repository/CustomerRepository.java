package com.techstack.dinamicsmodels.repository;

import com.techstack.dinamicsmodels.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
