package org.web.bankingapp.entity;

import jakarta.persistence.*;
import org.web.bankingapp.enums.CurrencyType;

@Entity
@Table(name = "bank_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auro marire
    private Long id;

    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;

    private double balance;

    //-------------------------------------------------------------------------------------------------

    public Account() {
        //
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
