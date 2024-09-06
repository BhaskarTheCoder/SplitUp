package com.spring.backend.IServices;

import com.spring.backend.models.Transaction;
import com.spring.backend.models.User;

public interface ITransactionService {
    public Transaction saveTransactionInfo(Transaction transaction) throws Exception;
}
