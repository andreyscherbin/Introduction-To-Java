package com.company;

public class TravelVoucher {

    private String place;
    private String typeVoucher;
    private String typeTransport;
    private String typeFood;
    private int numberDays;
    private String dateDeparture;
    private int cost;

    TravelVoucher(String place, String typeVoucher, String typeTransport, String typeFood, int numberDays, String dateDeparture, int cost) {
        this.place = place;
        this.typeVoucher = typeVoucher;
        this.typeTransport = typeTransport;
        this.typeFood = typeFood;
        this.numberDays = numberDays;
        this.dateDeparture = dateDeparture;
        this.cost = cost;
    }

    public String getPlace() {
        return place;
    }

    public String getTypeVoucher() {
        return typeVoucher;
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public int getNumberDays() {
        return numberDays;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "place: " + place + " typeVoucher: " + typeVoucher + " typeTransport: " + typeTransport + " typeFood: " + typeFood + " numberDays: " + numberDays + " dateDeparture: " + dateDeparture + " cost: " + cost;
    }
}
