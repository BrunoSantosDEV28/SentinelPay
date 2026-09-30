package com.sentinelpay.controller;

import com.sentinelpay.service.TransactionService;
import com.sentinelpay.model.Transaction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final TransactionService transactionService;

    public HealthController(TransactionService transactionService){
        this.transactionService = transactionService;

    }

    @PostMapping("/api/transactions")
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return transactionService.saveTransaction(transaction);
    }
    @GetMapping("/api/health")
    public String health() {
        return "SentinelPay está funcionando!";
    }
}
