package com.techstack.dinamicsmodels.repository;

import com.techstack.dinamicsmodels.models.BankInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankInformationRepository extends JpaRepository<BankInformation, Long> {

}
