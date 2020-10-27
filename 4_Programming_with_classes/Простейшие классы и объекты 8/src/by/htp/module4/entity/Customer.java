package by.htp.module4.entity;

import java.io.Serializable;

public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String surname;
    private String middleName;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer() {
        super();
    }

    public Customer(int id, String name, String surname, String middleName, String address, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getAddress() {
        return this.address;
    }

    public int getCreditCardNumber() {
        return this.creditCardNumber;
    }

    public int getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (o == null) return false;
        if (!(o instanceof Customer)) {
            return false;
        }

        Customer customer = (Customer) o;

        return customer.id == id &&
                customer.name.equals(name) &&
                customer.surname.equals(surname) &&
                customer.middleName.equals(middleName) &&
                customer.address.equals(address) &&
                customer.creditCardNumber == creditCardNumber &&
                customer.bankAccountNumber == bankAccountNumber;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + middleName.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + creditCardNumber;
        result = 31 * result + bankAccountNumber;
        return result;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getSurname() + " " + this.getMiddleName();

    }
}
