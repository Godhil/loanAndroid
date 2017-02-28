package com.example.denis.app.models;

import org.joda.time.LocalDate;

import java.math.BigDecimal;

public class Operation {

    private Long id;
    private Type type;
    private BigDecimal amount;
    private LocalDate dateOperation;
    private CashBox cashbox;
    private User user;
    private Client client;
    private Loan loan;

    /**
     *  Тип операции - приход / расход
     */
    private enum Type { Receipt, Expense }
}
