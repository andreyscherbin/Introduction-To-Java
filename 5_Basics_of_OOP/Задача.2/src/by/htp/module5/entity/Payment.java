package by.htp.module5.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private List<Product> products;

    {
        products = new ArrayList<Product>();
    }

    public Payment() {

    }

    public Payment(String name) {

        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {

        this.products = products;
    }

    public boolean addProduct(String productName, int productCost) {

        Product product = new Product(productName, productCost);
        return products.add(product);
    }

    public boolean removeProduct(String productName, int productCost) {

        Product product = new Product(productName, productCost);
        return products.remove(product);
    }

    static public class Product implements Serializable {

        private static final long serialVersionUID = 2L;

        private String productName;
        private int productCost;

        public Product() {

        }

        public Product(String productName, int productCost) {

            this.productName = productName;
            this.productCost = productCost;
        }

        public void setProductName(String productName) {

            this.productName = productName;
        }

        public void setProductCost(int productCost) {

            this.productCost = productCost;
        }

        public String getProductName() {
            return this.productName;
        }

        public int getProductCost() {

            return this.productCost;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Product product = (Product) obj;
            if (productName == null) {
                if (product.productName != null)
                    return false;
            } else if (!productName.equals(product.productName))
                return false;
            if (productCost != product.productCost)
                return false;
            return true;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((productName == null) ? 0 : productName.hashCode());
            result = prime * result + productCost;
            return result;
        }

        @Override
        public String toString() {
            return "ProductName: " + productName + "ProductCost: " + productCost;
        }
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Payment payment = (Payment) obj;
        if (name == null) {
            if (payment.name != null)
                return false;
        } else if (!name.equals(payment.name))
            return false;
        if (products == null) {
            if (payment.products != null)
                return false;
        } else if (!products.equals(payment.products))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((products == null) ? 0 : products.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Payment name: " + name + "Products: " + products;
    }
}