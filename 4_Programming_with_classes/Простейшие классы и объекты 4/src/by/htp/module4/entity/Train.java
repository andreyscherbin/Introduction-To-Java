package by.htp.module4.entity;

import java.io.Serializable;

public class Train implements Serializable {

    private static final long serialVersionUID = 2L;

    private String destination;
    private int trainNumber;
    private double time;

    public Train() {
        super();
    }

    public Train(String destination, int trainNumber, double time) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.time = time;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTime(int time){
        this.time = time;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getDestination() {
        return destination;
    }

    public double getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Train)) {
            return false;
        }

        Train train = (Train) o;

        return train.destination.equals(destination) &&
                train.trainNumber == (trainNumber) &&
                train.time == time;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + destination.hashCode();
        result = 31 * result + trainNumber;
        result = 31 * result + (int)time;
        return result;
    }

    @Override
    public String toString() {
        return "Destination: " + destination + " TrainNumber: " + trainNumber + " time: " + time;
    }
}
