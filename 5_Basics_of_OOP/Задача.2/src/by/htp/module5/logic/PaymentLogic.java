package by.htp.module5.logic;

import by.htp.module5.entity.Payment;

import java.util.Scanner;

public class PaymentLogic {

    public boolean makePayment(Payment payment) {

        System.out.print("Введите количество товаров, которое Вы хотите” + + “приобрести: ");
        Scanner scanner = new Scanner(System.in);
        int counterProducts = scanner.nextInt();

        for (int i = 0; i < counterProducts; i++) {
            System.out.println("Товар " + (i + 1) + ": ");
            System.out.print("Наименование: ");
            String nameProduct = scanner.next();
            System.out.print("Цена: ");
            int costProduct = scanner.nextInt();
            payment.addProduct(nameProduct, costProduct);
        }
        return true;
    }

    public int getCost(Payment payment) {

        int cost = 0;

        for (Payment.Product product : payment.getProducts()) {
            cost = cost + product.getProductCost();
        }
        return cost;
    }
}
