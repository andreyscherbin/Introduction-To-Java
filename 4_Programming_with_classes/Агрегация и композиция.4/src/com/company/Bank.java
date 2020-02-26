package com.company;

public class Bank {

    private Client[] clients;
    private BankAccount[] bankAccounts;

    Bank(Client[] clients, BankAccount[] bankAccounts) {
        this.clients = clients;
        this.bankAccounts = bankAccounts;
    }

    public void blockBankAccount(String nameClient) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getClientName() == nameClient) {
                bankAccount.block();
            }
        }
    }

    public void unblockBankAccount(String nameClient) {
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getClientName() == nameClient) {
                bankAccount.unblock();
            }
        }
    }

    public void searchBankAccount(String accountNumber, String clientName) {

        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAccountNumber() == accountNumber && bankAccount.getClientName() == clientName) {
                System.out.println(bankAccount.toString());
            }
        }
    }

    public void sortBankAccount(String clientName) {

        for (int i = 0; i < bankAccounts.length; i++) {
            for (int j = 0; j < bankAccounts.length - i - 1; j++) {
                if (bankAccounts[j].getAmount() < bankAccounts[j + 1].getAmount() && bankAccounts[j].getClientName() == bankAccounts[j + 1].getClientName()) {
                    BankAccount var = bankAccounts[j];
                    bankAccounts[j] = bankAccounts[j + 1];
                    bankAccounts[j + 1] = var;
                }
            }
        }
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getClientName() == clientName) {
                System.out.println(bankAccount.toString());
            }
        }
    }

    public int getCommonSummAmount(String clientName) {
        int commonSummAmount = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getClientName() == clientName) {
                commonSummAmount += bankAccount.getAmount();
            }
        }
        return commonSummAmount;
    }

    public int getPositiveSummAmount(String clientName) {
        int positiveSummAmount = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAmount() > 0 && bankAccount.getClientName() == clientName) {
                positiveSummAmount += bankAccount.getAmount();
            }
        }
        return positiveSummAmount;
    }

    public int getNegativeSummAmount(String clientName) {
        int negativeSummAmount = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getAmount() < 0 && bankAccount.getClientName() == clientName) {
                negativeSummAmount += bankAccount.getAmount();
            }
        }
        return negativeSummAmount;
    }
}
