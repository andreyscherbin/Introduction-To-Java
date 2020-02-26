package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TravelAgency {

    private TravelVoucher[] travelVouchers;
    private String sortingCriterion = "";

    TravelAgency(TravelVoucher[] travelVouchers) {
        this.travelVouchers = travelVouchers;
    }

    public void setSortingCriterion(String sortingCriterion) {
        this.sortingCriterion = sortingCriterion;
    }

    private void printInSortedOrder(List<TravelVoucher> travelVouchers) {

        for (int i = 0; i < travelVouchers.size(); i++) {
            for (int j = 0; j < travelVouchers.size() - i - 1; j++) {

                if (sortingCriterion == "Days" && travelVouchers.get(j).getNumberDays() < travelVouchers.get(j + 1).getNumberDays()) {
                    Collections.swap(travelVouchers, j, j + 1);
                }
                if (sortingCriterion == "Cost" && travelVouchers.get(j).getCost() < travelVouchers.get(j + 1).getCost()) {
                    Collections.swap(travelVouchers, j, j + 1);
                }
            }
        }
        for (TravelVoucher travelVoucher : travelVouchers) {
            System.out.println(travelVoucher.toString());
        }
    }

    public void printPlace(String place) {
        List<TravelVoucher> travelVouchers = new ArrayList<>();
        for (TravelVoucher travelVoucher : this.travelVouchers) {
            if (travelVoucher.getPlace() == place) {
                travelVouchers.add(travelVoucher);
            }
        }
        printInSortedOrder(travelVouchers);
    }

    public void printTypeVoucher(String typeVoucher) {
        List<TravelVoucher> travelVouchers = new ArrayList<>();
        for (TravelVoucher travelVoucher : this.travelVouchers) {
            if (travelVoucher.getTypeVoucher() == typeVoucher) {
                travelVouchers.add(travelVoucher);
            }
        }
        printInSortedOrder(travelVouchers);
    }

    public void printTypeFoodTransportDays(String typeFood, String typeTransport, int numberDays) {
        List<TravelVoucher> travelVouchers = new ArrayList<>();
        for (TravelVoucher travelVoucher : this.travelVouchers) {
            if (travelVoucher.getTypeFood() == typeFood && travelVoucher.getTypeTransport() == typeTransport && travelVoucher.getNumberDays() == numberDays) {
                travelVouchers.add(travelVoucher);
            }
        }
        printInSortedOrder(travelVouchers);
    }
}
