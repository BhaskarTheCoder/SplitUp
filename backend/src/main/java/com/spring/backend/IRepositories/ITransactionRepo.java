package com.spring.backend.IRepositories;

import com.spring.backend.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransactionRepo extends JpaRepository<Transaction, Integer> {

}
