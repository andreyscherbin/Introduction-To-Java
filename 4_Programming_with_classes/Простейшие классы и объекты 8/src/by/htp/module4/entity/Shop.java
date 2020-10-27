package by.htp.module4.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Customer> customers;

    {
        customers = new ArrayList<Customer>();
    }

    public Shop() {

    }

    public Shop(List<Customer> customers) {

        this.customers = customers;

    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (o == null)
            return false;
        if (!(o instanceof Shop)) {
            return false;
        }

        Shop shop = (Shop) o;

        if (shop.customers == customers) {
            return true;
        }

        return shop.customers.equals(customers);

    }

    @Override
    public int hashCode() {

        int result = 17;

        result = 31 * result + ((customers == null) ? 0 : customers.hashCode());
        return result;
    }

    @Override
    public String toString() {

        StringBuilder string = new StringBuilder();
        String delimeter = "\n";
        for (Customer customer : customers) {
            string.append(customer.toString());
            string.append(delimeter);

        }
        return string.toString();
    }
}
