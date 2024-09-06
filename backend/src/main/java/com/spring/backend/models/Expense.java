package com.spring.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int expenseId;

    @ManyToOne
    @JoinColumn(name = "transactionId")
    private Transaction transaction;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User secondUser;

    private int expense;
}
