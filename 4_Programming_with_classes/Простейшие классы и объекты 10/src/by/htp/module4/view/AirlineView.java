package by.htp.module4.view;

import by.htp.module4.entity.Airline;

import java.util.List;

public class AirlineView {

    public void print(List<Airline> airlines) {

        for (Airline airline : airlines) {
            System.out.println(airline);
        }
    }
}
