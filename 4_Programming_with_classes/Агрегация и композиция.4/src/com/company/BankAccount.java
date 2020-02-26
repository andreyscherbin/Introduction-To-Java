package com.company;

public class BankAccount {

    private String clientName;
    private String accountNumber;
    private boolean isBlocked;
    private int amount;

    BankAccount(String clientName, String accountNumber, boolean isBlocked, int amount) {
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.isBlocked = isBlocked;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "clientName: " + clientName + " accountNumber: " + accountNumber + " isBlocked: " + isBlocked + " amount: " + amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public int getAmount() {
        return amount;
    }

    public void block() {

        isBlocked = true;
    }

    public void unblock() {

        isBlocked = false;
    }
}
