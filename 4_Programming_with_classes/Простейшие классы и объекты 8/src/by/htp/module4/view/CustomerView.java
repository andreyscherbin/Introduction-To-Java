package by.htp.module4.view;

import by.htp.module4.entity.Customer;

import java.util.List;

public class CustomerView {

    public void printCustomersListInCreditCardNumberRange(List<Customer> customers, int range1, int range2) {

        for (Customer customer : customers) {
            if (customer.getCreditCardNumber() >= range1 && customer.getCreditCardNumber() <= range2) {
                System.out.println(customer);
            }
        }
    }

    public void printCustomersListInAlphabetOrder(List<Customer> customers) {

        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
