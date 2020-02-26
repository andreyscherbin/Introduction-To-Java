package com.company;

public class Client {

    private String clientName;
    private TravelAgency travelAgency;

    Client(String name, TravelAgency travelAgency) {
        this.clientName = name;
        this.travelAgency = travelAgency;
    }

    public String getName() {
        return clientName;
    }

    public void printPlace(String place) {
        travelAgency.printPlace(place);
    }

    public void printTypeVoucher(String typeVoucher) {
        travelAgency.printTypeVoucher(typeVoucher);
    }

    public void printTypeFoodTransportDays(String typeFood, String typeTransport, int numberDays) {
        travelAgency.printTypeFoodTransportDays(typeFood, typeTransport, numberDays);
    }

    public void setSortingCriterion(String sortingCriterion) {
        travelAgency.setSortingCriterion(sortingCriterion);
    }
}
