package by.htp.module4.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ControlRoom implements Serializable {

    private static final long serialVersionUID = 2L;

    private List<Airline> airlines;

    {
        airlines = new ArrayList<Airline>();
    }

    public ControlRoom() {

    }

    public ControlRoom(List<Airline> airlines) {

        this.airlines = airlines;

    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (o == null)
            return false;
        if (!(o instanceof ControlRoom)) {
            return false;
        }

        ControlRoom controlRoom = (ControlRoom) o;

        if (controlRoom.airlines == airlines) {
            return true;
        }

        return controlRoom.airlines.equals(airlines);
    }

    @Override
    public int hashCode() {

        int result = 17;

        result = 31 * result + ((airlines == null) ? 0 : airlines.hashCode());
        return result;
    }

    @Override
    public String toString() {

        StringBuilder string = new StringBuilder();
        String delimeter = "\n";
        for (Airline airline : airlines) {
            string.append(airline.toString());
            string.append(delimeter);
        }
        return string.toString();
    }
}
