package by.htp.module4.entity;

import java.io.Serializable;

public class Airline implements Serializable {

    private static final long serialVersionUID = 1L;

    private String destination;
    private int flightNumber;
    private String typeAirplane;
    private double departureTime;
    private String dayWeek;

    public Airline() {

    }

    public Airline(String destination, int flightNumber, String typeAirplane, double departureTime, String dayWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeAirplane = typeAirplane;
        this.departureTime = departureTime;
        this.dayWeek = dayWeek;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setTypeAirplane(String typeAirplane) {
        this.typeAirplane = typeAirplane;
    }

    public void setDepartureTime(Double departureTime) {
        this.departureTime = departureTime;
    }

    public void setDayWeekD(String dayWeek) {
        this.dayWeek = dayWeek;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getTypeAirplane() {
        return typeAirplane;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public String getDayWeek() {
        return dayWeek;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (o == null) return false;
        if (!(o instanceof Airline)) {
            return false;
        }

        Airline airline = (Airline) o;

        return airline.dayWeek.equals(dayWeek) &&
                airline.destination.equals(destination) &&
                airline.departureTime == departureTime &&
                airline.flightNumber == flightNumber &&
                airline.typeAirplane.equals(typeAirplane);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + dayWeek.hashCode();
        result = 31 * result + destination.hashCode();
        result = 31 * result + typeAirplane.hashCode();
        result = 31 * result + (int) departureTime;
        result = 31 * result + flightNumber;
        return result;
    }

    @Override
    public String toString() {
        return this.getDestination() + " " + this.getFlightNumber() + " " + this.getTypeAirplane() + " " + this.getDepartureTime() + " " + this.getDayWeek();

    }
}
