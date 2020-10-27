package by.htp.module4.main;

import by.htp.module4.entity.Depo;
import by.htp.module4.entity.Train;
import by.htp.module4.logic.TrainLogic;
import by.htp.module4.view.TrainView;

import java.util.Scanner;

public class Main {

    /*
     * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
     * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
     * по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
     * Добавьте возможность сортировки массивов по пункту назначения, причем поезда с одинаковыми пунктами назначения
     * должны быть упорядочены по времени отправления.
     */
    public static void main(String[] args) {

        TrainLogic trainLogic = new TrainLogic();
        TrainView trainView = new TrainView();
        Depo depo = new Depo(1);

        Train train1 = new Train("Anapa", 1, 11.00);
        Train train2 = new Train("Orwa", 56, 12.25);
        Train train3 = new Train("Orwa", 80, 13.10);
        Train train4 = new Train("Orwa", 90, 00.55);
        Train train5 = new Train("Anapa", 24, 12.15);

        depo.addTrain(train1);
        depo.addTrain(train2);
        depo.addTrain(train3);
        depo.addTrain(train3);
        depo.addTrain(train4);
        depo.addTrain(train5);

        System.out.println(depo);

        depo.setTrains(trainLogic.sortByTrainNumber(depo.getTrains()));
        System.out.println("after sortTrainNumber");

        System.out.println(depo);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter train number ");
        int trainNumber = scanner.nextInt();

        trainView.print(trainLogic.getInfoTrainNumber(depo.getTrains(),trainNumber));

        depo.setTrains(trainLogic.sortByDestination(depo.getTrains()));
        System.out.println("after sortByDestination and sortByTime");

        System.out.println(depo);

    }
}
