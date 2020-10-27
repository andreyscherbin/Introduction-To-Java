package by.htp.module4_1.main;

import by.htp.module4_1.entity.Test1;
import by.htp.module4_1.logic.Test1Logic;
import by.htp.module4_1.view.Test1View;

public class Main {

    /*
     * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных
     * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
     * из этих двух переменных.
     */
    public static void main(String[] args) {

        Test1 entity = new Test1();
        Test1Logic logic = new Test1Logic();
        Test1View view = new Test1View();
        logic.decrement(entity);
        logic.increment(entity);
        logic.decrement(entity);
        view.print(entity);
        view.printSum(logic.getSum(entity));
        view.printMax(logic.findMax(entity));
    }
}
