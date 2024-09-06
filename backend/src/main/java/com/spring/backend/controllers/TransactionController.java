package com.spring.backend.controllers;

import com.spring.backend.IServices.ITransactionService;
import com.spring.backend.IServices.IUserService;
import com.spring.backend.models.Transaction;
import com.spring.backend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
@CrossOrigin("*")
public class TransactionController {
    @Autowired
    ITransactionService transactionService;

    @PostMapping("/addSplit")
    public Transaction saveTransactionInfo(@RequestBody Transaction  transaction) throws Exception {
        return transactionService.saveTransactionInfo(transaction);
    }

}
