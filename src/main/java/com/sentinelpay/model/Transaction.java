package com.sentinelpay.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;


@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;
    private Long userId;

    @Enumerated(EnumType.STRING)
    private TransactionStatus status;

    @Column(precision = 15, scale = 2)
    private BigDecimal amount;

    @Column (length = 2)
    private String origin;

    @Column (length = 2)
    private String destination;

    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();

    }
}
