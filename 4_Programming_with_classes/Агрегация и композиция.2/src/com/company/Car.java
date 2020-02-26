package com.company;

public class Car {

    private Motor motor;
    private Wheel[] wheels;
    private String carModel;
    private int fuel;
    private int fuelConsumption;

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

    public void printCarModel() {
        System.out.print(carModel);
    }

    public void drive(int kilometer) {

        fuel -= fuelConsumption * 100 * kilometer;
    }

    public void refuel(int fuel) {
        this.fuel += fuel;
    }

    public void changeWheel(int numberWheel, Wheel wheel) {

        wheels[numberWheel - 1] = wheel;
    }
}
