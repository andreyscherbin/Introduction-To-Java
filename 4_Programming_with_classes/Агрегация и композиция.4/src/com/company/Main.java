package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    /*
     * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
     * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
     * имеющим положительный и отрицательный балансы отдельно.
     */
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

