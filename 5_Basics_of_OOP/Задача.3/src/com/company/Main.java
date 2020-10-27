package com.company;

/*
  Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных
  и праздничных днях
 */

public class Main {

    public static void main(String[] args) {

        Calendar calendar = new Calendar(2019);
        System.out.println(calendar);
        calendar.makeHolidayDay(1, 1);
        calendar.makeHolidayDay(28, 3);
        System.out.println(calendar);
    }
}

