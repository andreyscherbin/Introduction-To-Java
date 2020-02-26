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

    private static class TravelVoucher {

        String place;
        String typeVoucher;
        String typeTransport;
        String typeFood;
        int numberDays;
        String dateDeparture;
        int cost;

        TravelVoucher(String place, String typeVoucher, String typeTransport, String typeFood, int numberDays, String dateDeparture, int cost) {
            this.place = place;
            this.typeVoucher = typeVoucher;
            this.typeTransport = typeTransport;
            this.typeFood = typeFood;
            this.numberDays = numberDays;
            this.dateDeparture = dateDeparture;
            this.cost = cost;
        }

        private String getPlace() {
            return place;
        }

        private String getTypeVoucher() {
            return typeVoucher;
        }

        private String getTypeTransport() {
            return typeTransport;
        }

        private String getTypeFood() {
            return typeFood;
        }

        private int getNumberDays() {
            return numberDays;
        }

        private int getCost() {
            return cost;
        }

        @Override
        public String toString() {
            return "place: " + place + " typeVoucher: " + typeVoucher + " typeTransport: " + typeTransport + " typeFood: " + typeFood + " numberDays: " + numberDays + " dateDeparture: " + dateDeparture + " cost: " + cost;
        }
    }

    private static class TravelAgency {

        TravelVoucher[] travelVouchers;
        String sortingCriterion = "";

        TravelAgency(TravelVoucher[] travelVouchers) {
            this.travelVouchers = travelVouchers;
        }

        private void setSortingCriterion(String sortingCriterion) {
            this.sortingCriterion = sortingCriterion;
        }

        private void printInSortedOrder(List<TravelVoucher> travelVouchers) {

            for (int i = 0; i < travelVouchers.size(); i++) {
                for (int j = 0; j < travelVouchers.size() - i - 1; j++) {

                    if (sortingCriterion == "Days" && travelVouchers.get(j).getNumberDays() < travelVouchers.get(j + 1).getNumberDays()) {
                        Collections.swap(travelVouchers, j, j + 1);
                    }
                    if (sortingCriterion == "Cost" && travelVouchers.get(j).getCost() < travelVouchers.get(j + 1).getCost()) {
                        Collections.swap(travelVouchers, j, j + 1);
                    }
                }
            }
            for (TravelVoucher travelVoucher : travelVouchers) {
                System.out.println(travelVoucher.toString());
            }
        }

        private void printPlace(String place) {
            List<TravelVoucher> travelVouchers = new ArrayList<>();
            for (TravelVoucher travelVoucher : this.travelVouchers) {
                if (travelVoucher.getPlace() == place) {
                    travelVouchers.add(travelVoucher);
                }
            }
            printInSortedOrder(travelVouchers);
        }

        private void printTypeVoucher(String typeVoucher) {
            List<TravelVoucher> travelVouchers = new ArrayList<>();
            for (TravelVoucher travelVoucher : this.travelVouchers) {
                if (travelVoucher.getTypeVoucher() == typeVoucher) {
                    travelVouchers.add(travelVoucher);
                }
            }
            printInSortedOrder(travelVouchers);
        }

        private void printTypeFoodTransportDays(String typeFood, String typeTransport, int numberDays) {
            List<TravelVoucher> travelVouchers = new ArrayList<>();
            for (TravelVoucher travelVoucher : this.travelVouchers) {
                if (travelVoucher.getTypeFood() == typeFood && travelVoucher.getTypeTransport() == typeTransport && travelVoucher.getNumberDays() == numberDays) {
                    travelVouchers.add(travelVoucher);
                }
            }
            printInSortedOrder(travelVouchers);
        }
    }

    private static class Client {

        String clientName;
        TravelAgency travelAgency;

        Client(String name, TravelAgency travelAgency) {
            this.clientName = name;
            this.travelAgency = travelAgency;
        }

        private String getName() {
            return clientName;
        }

        private void printPlace(String place) {
            travelAgency.printPlace(place);
        }

        private void printTypeVoucher(String typeVoucher) {
            travelAgency.printTypeVoucher(typeVoucher);
        }

        private void printTypeFoodTransportDays(String typeFood, String typeTransport, int numberDays) {
            travelAgency.printTypeFoodTransportDays(typeFood, typeTransport, numberDays);
        }

        private void setSortingCriterion(String sortingCriterion) {
            travelAgency.setSortingCriterion(sortingCriterion);
        }
    }

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

