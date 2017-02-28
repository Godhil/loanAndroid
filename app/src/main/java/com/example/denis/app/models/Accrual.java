package com.example.denis.app.models;

import org.joda.time.LocalDate;

import java.math.BigDecimal;

public class Accrual {

    private Long id;
    private Loan loan;
    private BigDecimal accrualPercent;
    private BigDecimal accrualPenalty;
    private BigDecimal balanceDebt;
    private BigDecimal paymentPercent;
    private BigDecimal paymentPenalty;
    private BigDecimal paymentDebt;
    private LocalDate dateAccrual;


}
