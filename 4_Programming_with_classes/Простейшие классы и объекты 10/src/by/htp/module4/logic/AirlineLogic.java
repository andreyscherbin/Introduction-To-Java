package by.htp.module4.logic;

import by.htp.module4.entity.Airline;

import java.util.List;
import java.util.ArrayList;

public class AirlineLogic {

    public List<Airline> findAirlineListDestination(String destination, List<Airline> airlines) {

        List<Airline> findAirlines = new ArrayList<Airline>();
        for (Airline airline : airlines) {
            if (airline.getDestination() == destination) {
                findAirlines.add(airline);
            }
        }
        return findAirlines;
    }

    public List<Airline> findAirlineListDayWeek(String dayWeek, List<Airline> airlines) {

        List<Airline> findAirlines = new ArrayList<Airline>();
        for (Airline airline : airlines) {
            if (airline.getDayWeek() == dayWeek) {
                findAirlines.add(airline);
            }
        }
        return findAirlines;
    }

    public List<Airline> findAirlineListDayWeek(String dayWeek, double departureTime, List<Airline> airlines) {

        List<Airline> findAirlines = new ArrayList<Airline>();
        for (Airline airline : airlines) {
            if (airline.getDayWeek() == dayWeek && airline.getDepartureTime() > departureTime) {
                findAirlines.add(airline);
            }
        }
        return findAirlines;
    }
}
