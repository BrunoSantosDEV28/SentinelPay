package com.sentinelpay.model;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "transactions")
public class Transaction {



    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private TransactionStatus status;

    @Column(precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(length = 2)
    private String origin;

    @Column(length = 2)
    private String destination;

    private Long userId;

    private LocalDateTime createdAt;


    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }





    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }


    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }



    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }





    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();

    }
}

