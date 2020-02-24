package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    /*
     * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set и get методы и метод
     * toString(). Создать второй класс, агрегирующий массив типа Airline, c подходящими конструкторами и методами. Задать
     * критерии выбора данных и вывести данные на консоль.
     *
     * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
     * Найти и вывести:
     * a) список рейсов для заданного пункта назначения;
     * b) список рейсов для заданного для недели;
     * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
     */

    private static class ControlRoom {

        Airline[] airlines;

        ControlRoom(Airline[] airlines) {
            this.airlines = airlines;
        }

        private void printAirlineListDestination(String destination) {

            for (Airline airline : airlines) {
                if (airline.getDestination() == destination) {
                    System.out.println(airline.toString());
                }
            }
        }

        private void printAirlineListDayWeek(String dayWeek) {

            for (Airline airline : airlines) {
                if (airline.getDayWeek() == dayWeek) {
                    System.out.println(airline.toString());
                }
            }
        }

        private void printAirlineListDayWeek(String dayWeek, double departureTime) {

            for (Airline airline : airlines) {
                if (airline.getDayWeek() == dayWeek && airline.getDepartureTime() > departureTime) {
                    System.out.println(airline.toString());
                }
            }
        }
    }

    private static class Airline {

        private String destination;
        private int flightNumber;
        private String typeAirplane;
        private double departureTime;
        private String dayWeek;

        Airline(String destination, int flightNumber, String typeAirplane, double departureTime, String dayWeek) {
            this.destination = destination;
            this.flightNumber = flightNumber;
            this.typeAirplane = typeAirplane;
            this.departureTime = departureTime;
            this.dayWeek = dayWeek;
        }

        private void setDestination(String destination) {
            this.destination = destination;
        }

        private void setFlightNumber(int flightNumber) {
            this.flightNumber = flightNumber;
        }

        private void setTypeAirplane(String typeAirplane) {
            this.typeAirplane = typeAirplane;
        }

        private void setDepartureTime(Double departureTime) {
            this.departureTime = departureTime;
        }

        private void setDayWeekD(String dayWeek) {
            this.dayWeek = dayWeek;
        }

        private String getDestination() {
            return destination;
        }

        private int getFlightNumber() {
            return flightNumber;
        }

        private String getTypeAirplane() {
            return typeAirplane;
        }

        private double getDepartureTime() {
            return departureTime;
        }

        private String getDayWeek() {
            return dayWeek;
        }

        @Override
        public String toString() {
            return this.getDestination() + " " + this.getFlightNumber() + " " + this.getTypeAirplane() + " " + this.getDepartureTime() + " " + this.getDayWeek();

        }
    }

    public static void main(String[] args) {

        Airline[] airlines = {new Airline("moscow", 125, "boing", 19.00, "Monday"),
                new Airline("berlin", 126, "boing", 19.25, "tuesday"),
                new Airline("minsk", 127, "boing", 19.55, "wednesday"),
                new Airline("vena", 128, "boing", 20.00, "friday")};

        ControlRoom controlRoom = new ControlRoom(airlines);
        controlRoom.printAirlineListDayWeek("Monday");
        controlRoom.printAirlineListDayWeek("Monday", 19);
        controlRoom.printAirlineListDestination("berlin");
    }
}

