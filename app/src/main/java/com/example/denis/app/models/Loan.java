package com.example.denis.app.models;

import org.joda.time.LocalDate;

import java.math.BigDecimal;

public class Loan {

    private Long id;
    private Client client;
    private Office office;
    private Product product;
    private BigDecimal amount;
    private Integer term;
    private Status status;
    private LocalDate dateIssue;
    private LocalDate datePlannedRepaid;
    private Integer countOverdue;
    private Accrual lastAccrual;
    private Operation lastOperation;

    /**
     * Займ может иметь следующий статус:
     * Новый, На проверке, Отклонён, Одобрен, Выдан, Просрочен, Погашен
     */
    private enum Status {
        New("Новый"),
        Cheking("На проверке"),
        Rejected("Отклонён"),
        Approved("Одобрен"),
        Issued("Выдан"),
        Overdue("Просрочен"),
        Repaid("Погашен");

        private final String humanName;

        Status(String humanName) {
            this.humanName = humanName;
        }

        @Override
        public String toString() {
            return this.humanName;
        }
    }
}

