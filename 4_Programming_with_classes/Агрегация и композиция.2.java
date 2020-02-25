package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    /*
     * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять
     * колесо, вывести на консоль марку автомобиля.
     */

    private static class Car {

        Motor motor;
        Wheel[] wheels;
        String carModel;
        int fuel;
        int fuelConsumption;

        Car() {
            motor = new Motor();
            wheels = new Wheel[4];
            carModel = "";
            fuel = 100;
            fuelConsumption = 10;
        }

        Car(Motor motor, Wheel[] wheels, String carModel, int fuel) {
            this.motor = motor;
            this.wheels = wheels;
            this.carModel = carModel;
            this.fuel = fuel;
        }

        private void printCarModel() {
            System.out.print(carModel);
        }

        private void drive(int kilometer) {

            fuel -= fuelConsumption * 100 * kilometer;
        }

        private void refuel(int fuel) {
            this.fuel += fuel;
        }

        private void changeWheel(int numberWheel, Wheel wheel) {

            wheels[numberWheel - 1] = wheel;
        }
    }

    private static class Wheel {

        String wheelModel;

        Wheel() {
            wheelModel = "";
        }

        Wheel(String wheelModel) {
            this.wheelModel = wheelModel;
        }
    }

    private static class Motor {

        String motorModel;

        Motor() {
            motorModel = "";
        }

        Motor(String motorModel) {
            this.motorModel = motorModel;
        }
    }

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

