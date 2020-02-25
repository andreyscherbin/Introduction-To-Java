package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    /*
     * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
     * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
     * имеющим положительный и отрицательный балансы отдельно.
     */

    private static class BankAccount {

        String clientName;
        String accountNumber;
        boolean isBlocked;
        int amount;

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

        private String getAccountNumber() {
            return accountNumber;
        }

        private String getClientName() {
            return clientName;
        }

        private int getAmount() {
            return amount;
        }

        private void block() {

            isBlocked = true;
        }

        private void unblock() {

            isBlocked = false;
        }
    }

    private static class Bank {

        Client[] clients;
        BankAccount[] bankAccounts;

        Bank(Client[] clients, BankAccount[] bankAccounts) {
            this.clients = clients;
            this.bankAccounts = bankAccounts;
        }

        private void blockBankAccount(String nameClient) {
            for (BankAccount bankAccount : bankAccounts) {
                if (bankAccount.getClientName() == nameClient) {
                    bankAccount.block();
                }
            }
        }

        private void unblockBankAccount(String nameClient) {
            for (BankAccount bankAccount : bankAccounts) {
                if (bankAccount.getClientName() == nameClient) {
                    bankAccount.unblock();
                }
            }
        }

        private void searchBankAccount(String accountNumber, String clientName) {

            for (BankAccount bankAccount : bankAccounts) {
                if (bankAccount.getAccountNumber() == accountNumber && bankAccount.getClientName() == clientName) {
                    System.out.println(bankAccount.toString());
                }
            }
        }

        private void sortBankAccount(String clientName) {

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

        private int getCommonSummAmount(String clientName) {
            int commonSummAmount = 0;
            for (BankAccount bankAccount : bankAccounts) {
                if (bankAccount.getClientName() == clientName) {
                    commonSummAmount += bankAccount.getAmount();
                }
            }
            return commonSummAmount;
        }

        private int getPositiveSummAmount(String clientName) {
            int positiveSummAmount = 0;
            for (BankAccount bankAccount : bankAccounts) {
                if (bankAccount.getAmount() > 0 && bankAccount.getClientName() == clientName) {
                    positiveSummAmount += bankAccount.getAmount();
                }
            }
            return positiveSummAmount;
        }

        private int getNegativeSummAmount(String clientName) {
            int negativeSummAmount = 0;
            for (BankAccount bankAccount : bankAccounts) {
                if (bankAccount.getAmount() < 0 && bankAccount.getClientName() == clientName) {
                    negativeSummAmount += bankAccount.getAmount();
                }
            }
            return negativeSummAmount;
        }
    }

    private static class Client {

        String clientName;

        Client(String name) {
            this.clientName = name;
        }

        private String getName() {
            return clientName;
        }
    }

    public static void main(String[] args) {

        BankAccount[] bankAccounts = {new BankAccount("andrey", "1111-2222-3333-4444", false, -201),
                new BankAccount("andrey", "4444-5555-6666-7777", false, 3000),
                new BankAccount("petya", "1111-2222-3333-4445", false, 5000),
                new BankAccount("petya", "4444-5555-6666-7778", false, 9000),
                new BankAccount("vasya", "1111-2222-3333-4446", false, -500),
                new BankAccount("vasya", "4444-5555-6666-7779", false, 7000),
                new BankAccount("kostya", "1111-2222-3333-4447", false, -555),
                new BankAccount("kostya", "4444-5555-6666-7780", false, 5600)};

        Client[] clients =
                {
                        new Client("andrey"),
                        new Client("petya"),
                        new Client("vasya"),
                        new Client("kostya")
                };
        Bank bank = new Bank(clients, bankAccounts);
        bank.searchBankAccount("1111-2222-3333-4444", "andrey");
        bank.sortBankAccount("andrey");
        System.out.println(bank.getCommonSummAmount("andrey"));
        System.out.println(bank.getPositiveSummAmount("andrey"));
        System.out.println(bank.getNegativeSummAmount("andrey"));
        bank.blockBankAccount("andrey");
        bank.searchBankAccount("1111-2222-3333-4444", "andrey");
        bank.unblockBankAccount("andrey");
        bank.searchBankAccount("1111-2222-3333-4444", "andrey");
    }
}

