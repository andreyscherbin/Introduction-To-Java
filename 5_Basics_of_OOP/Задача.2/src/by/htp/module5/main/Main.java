package by.htp.module5.main;

import by.htp.module5.view.PaymentView;
import by.htp.module5.entity.Payment;
import by.htp.module5.logic.PaymentLogic;

/*
    Создать класс Payment с внутренним класом, с помощью объектов которого можно сформировать покупку из
    нескольких товаров
*/
public class Main {

    public static void main(String[] args) {

        Payment pay = new Payment("Payment");
        PaymentLogic paymentLogic = new PaymentLogic();
        PaymentView paymentView = new PaymentView();
        paymentLogic.makePayment(pay);
        paymentView.printCheque(pay, paymentLogic);

    }
}

