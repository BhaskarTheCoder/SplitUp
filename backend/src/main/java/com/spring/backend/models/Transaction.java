package com.spring.backend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transcationId;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;


    @OneToMany(mappedBy = "transaction", cascade = CascadeType.ALL)
    private List<Expense> expenseList;
}
