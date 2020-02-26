package com.company;

public class Main {

    /*
     * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять
     * колесо, вывести на консоль марку автомобиля.
     */
    public static void main(String[] args) {

        Motor motor = new Motor("7A");
        Wheel[] wheels = {new Wheel("Bridgestone"), new Wheel("Bridgestone"),
                new Wheel("Bridgestone"), new Wheel("Bridgestone")};
        Car car = new Car(motor, wheels, "RENO", 100);
        car.printCarModel();
        car.drive(50);
        car.refuel(100);
        car.changeWheel(1, new Wheel("Continental"));
    }
}

