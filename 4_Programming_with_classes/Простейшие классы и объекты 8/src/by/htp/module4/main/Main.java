package by.htp.module4.main;

import by.htp.module4.entity.Shop;
import by.htp.module4.entity.Customer;
import by.htp.module4.logic.CustomerLogic;
import by.htp.module4.view.CustomerView;

import java.util.Scanner;

public class Main {

    /*
     * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set и get методы и метод
     * toString(). Создать второй класс, агрегирующий массив типа Customer, c подходящими конструкторами и методами.
     * Задать критерии выбора данных и вывести эти данные на консоль.
     *
     * Класс Customer:id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
     * Найти и вывести:
     * a) Список покупателей в алфавитном порядке;
     * b) Список покупателей, у которых номер кредитной карточки находится в заданном интервале
     */
    public static void main(String[] args) {

        CustomerLogic customerLogic = new CustomerLogic();
        CustomerView customerView = new CustomerView();
        Shop shop = new Shop();

        Customer customer1 = new Customer(1, "andrey", "scherbin", "vasechkin", "yl.Puwkina", 1111, 777);
        Customer customer2 = new Customer(2, "petya", "orlov", "petichkin", "yl.Puwkina", 2222, 888);
        Customer customer3 = new Customer(3, "vasya", "molotov", "vasechkin", "yl.Petrova", 3333, 999);
        Customer customer4 = new Customer(4, "kolya", "lybimov", "krytov", "yl.Genadeva", 4444, 444);
        Customer customer5 = new Customer(5, "nikolay", "solniwkin", "hohlov", "yl.Pobedi", 1001, 333);

        shop.addCustomer(customer1);
        shop.addCustomer(customer2);
        shop.addCustomer(customer3);
        shop.addCustomer(customer4);
        shop.addCustomer(customer5);

        System.out.println(shop);

        customerView.printCustomersListInAlphabetOrder(customerLogic.customersListInAlphabetOrder(shop.getCustomers()));
        customerView.printCustomersListInCreditCardNumberRange(shop.getCustomers(), 1000, 3000);

    }
}
