package org.web.bankingapp.dto;

import org.web.bankingapp.enums.CurrencyType;

public class AccountCreationRequest {
    private String username;
    private String accountNumber;
    private Double balance;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
