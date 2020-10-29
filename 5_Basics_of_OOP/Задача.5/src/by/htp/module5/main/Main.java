package by.htp.module5.main;

import by.htp.module5.interfaces.AbstractProduct;
import by.htp.module5.logic.GiftFactory;

import java.util.Scanner;

/*
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * - Корректно спроектируйте и реализуйте предметную область задачи.
 * - Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования
 * - Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
 * - Для проверки корректности переданных данных можно применять регулярные выражения.
 * - Меню выбора действий пользователем можно не реализовывать, используйте заглушку.
 * - Особое условие:  переопределите, где необходимо, методы toString(), equals(), и hashCode().
 *
 * Вариант Б. Подарки. Реализовать приложение позволяющее создавать подарки (объект, представляющий собой подарок).
 * Составляющими целого подарка являются сладости и упаковка.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GiftFactory factory = new GiftFactory();
        int cost = 0;
        System.out.println("Введите цену подарка ");
        cost = scanner.nextInt();
        AbstractProduct product = factory.createProduct(cost);
        if (product == null) {
            System.out.println("Недостаточно средств");
        } else {
            System.out.println(product.toString());
        }
    }
}
