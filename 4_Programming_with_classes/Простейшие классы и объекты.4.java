package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
     * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
     * по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
     * Добавьте возможность сортировки массивов по пункту назначения, причем поезда с одинаковыми пунктами назначения
     * должны быть упорядочены по времени отправления.
     */
    private static class Train {

        private String destination;
        private int trainNumber;
        private double time;

        Train(String destination, int trainNumber, double time) {
            this.destination = destination;
            this.trainNumber = trainNumber;
            this.time = time;
        }

        private int getTrainNumber() {
            return trainNumber;
        }

        private String getDestination() {
            return destination;
        }

        private double getTime() {
            return time;
        }

        private void printInfo() {
            System.out.printf("destination = %s, trainNumber = %d, Time = %f\n", destination, trainNumber, time);
        }

        private static void sortTrainNumber(Train[] massive) {
            for (int i = 0; i < massive.length; i++) {
                for (int j = 0; j < massive.length - i - 1; j++) {
                    if (massive[j].getTrainNumber() > massive[j + 1].getTrainNumber()) {
                        Train var = massive[j];
                        massive[j] = massive[j + 1];
                        massive[j + 1] = var;
                    }
                }
            }
        }

        private static void sortDestination(Train[] massive) {
            for (int i = 0; i < massive.length; i++) {
                for (int j = 0; j < massive.length - i - 1; j++) {
                    if (massive[j].getDestination().charAt(0) > massive[j + 1].getDestination().charAt(0)) {
                        Train var = massive[j];
                        massive[j] = massive[j + 1];
                        massive[j + 1] = var;
                    }
                }
            }
            for (int i = 0; i < massive.length; i++) {
                int j = 0;
                for (j = i + 1; j < massive.length; j++) {
                    if (j != i && massive[j].getDestination() != massive[i].getDestination()) {
                        sortTime(massive, i, j);
                        i = j - 1;
                        break;
                    }
                }
                if (j == massive.length && massive[j - 1].getDestination() == massive[i].getDestination()) {
                    sortTime(massive, i, j);
                    i = j - 1;
                }
            }
        }

        private static void sortTime(Train[] massive, int firstIndex, int lastIndex) {
            for (int i = 0; i < lastIndex - firstIndex; i++) {
                for (int j = firstIndex; j < lastIndex - i - 1; j++) {
                    if (massive[j].getTime() < massive[j + 1].getTime()) {
                        Train var = massive[j];
                        massive[j] = massive[j + 1];
                        massive[j + 1] = var;
                    }
                }
            }
        }

        private static void getInfoTrainNumber(Train[] massive, int trainNumber) {

            for (int i = 0; i < massive.length; i++) {
                if (massive[i].getTrainNumber() == trainNumber) {
                    massive[i].printInfo();
                }
            }
        }
    }

    public static void main(String[] args) {

        Train[] massive = {new Train("Anapa", 1, 11.00),
                new Train("Orwa", 56, 12.25),
                new Train("Orwa", 80, 13.10),
                new Train("Orwa", 90, 00.55),
                new Train("Anapa", 24, 10.15)};

        for (Train train : massive) {
            train.printInfo();
        }
        Train.sortTrainNumber(massive);
        System.out.println("after sortTrainNumber");
        for (Train train : massive) {
            train.printInfo();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter train number ");
        int trainNumber = scanner.nextInt();
        Train.getInfoTrainNumber(massive, trainNumber);
        Train.sortDestination(massive);
        System.out.println("after sortDestination and sortTime");
        for (Train train : massive) {
            train.printInfo();
        }
    }
}
