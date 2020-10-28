package by.htp.module5.view;

import by.htp.module5.entity.Payment;
import by.htp.module5.logic.PaymentLogic;

public class PaymentView {

    public void printCheque(Payment payment, PaymentLogic paymentLogic) {

        for (int i = 0; i < payment.getProducts().size(); i++) {
            System.out.printf("%3d", i + 1);
            System.out.printf("%15s",
                    payment.getProducts().get(i).getProductName());
            System.out.printf("%10d",
                    payment.getProducts().get(i).getProductCost());
            System.out.println();
        }
        System.out.print("Общая стоимость: ");
        System.out.printf("%11d", paymentLogic.getCost(payment));
    }
}
