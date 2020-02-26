package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    /*
     * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
     * (отдых, экскурсии, лечение, шопинг, круиз, и т.д.) для оптимального выбора. Учитывать возможность выбора
     * транспорта, питания, и числа дней. Реализовать выбор и сортировку путевок.
     */
    public static void main(String[] args) {

        TravelVoucher[] travelVouchers = {new TravelVoucher("Вена", "экскурсия", "автобус", "3 раза в день", 10, "26.02.2020", 100),
                new TravelVoucher("Ницца", "отдых", "самолет", "2 раза в день", 8, "28.02.2020", 700),
                new TravelVoucher("Ницца", "круиз", "поезд", "2 раза в день", 6, "29.02.2020", 600),
                new TravelVoucher("Швеция", "шопинг", "автобус", "3 раза в день", 7, "01.03.2020", 700),
                new TravelVoucher("Москва", "лечение", "самолет", "2 раза в день", 4, "02.03.2020", 800),
                new TravelVoucher("Ницца", "лечение", "самолет", "3 раза в день", 11, "02.03.2020", 900),
                new TravelVoucher("Египет", "шопинг", "поезд", "2 раза в день", 7, "03.03.2020", 100),
                new TravelVoucher("Венеция", "шопинг", "автобус", "3 раза в день", 8, "04.03.2020", 540)};
        TravelAgency travelAgency = new TravelAgency(travelVouchers);
        Client[] clients =
                {
                        new Client("andrey", travelAgency),
                        new Client("petya", travelAgency),
                        new Client("vasya", travelAgency),
                        new Client("kostya", travelAgency)
                };
        System.out.println("сортировка по числу дней");
        clients[0].setSortingCriterion("Days");
        clients[0].printPlace("Ницца");
        System.out.println("сортировка по стоимости");
        clients[0].setSortingCriterion("Cost");
        clients[0].printPlace("Ницца");
        System.out.println("Поиск путевки по питанию, типу транспорта, числу дней");
        clients[0].printTypeFoodTransportDays("2 раза в день", "самолет", 8);
    }
}

