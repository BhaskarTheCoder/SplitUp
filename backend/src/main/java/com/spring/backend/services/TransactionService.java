package com.spring.backend.services;

import com.spring.backend.IRepositories.ITransactionRepo;
import com.spring.backend.IServices.ITransactionService;
import com.spring.backend.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService implements ITransactionService {
    @Autowired
    private ITransactionRepo iTransactionRepo;

    @Override
    public Transaction saveTransactionInfo(Transaction transaction) throws Exception {
       return iTransactionRepo.save(transaction);
    }
}
