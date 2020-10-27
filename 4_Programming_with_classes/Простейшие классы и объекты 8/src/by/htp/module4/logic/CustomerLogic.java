package by.htp.module4.logic;

import by.htp.module4.entity.Customer;

import java.util.List;

public class CustomerLogic {

    public List<Customer> customersListInAlphabetOrder(List<Customer> customers) {

        for (int i = 0; i < customers.size(); i++) {
            for (int j = 0; j < customers.size() - i - 1; j++) {
                if (customers.get(j).getName().charAt(0) > customers.get(j + 1).getName().charAt(0)) {
                    Customer var = customers.get(j);
                    customers.set(j, customers.get(j + 1));
                    customers.set(j + 1, var);
                }
            }
        }
        return customers;
    }
}
