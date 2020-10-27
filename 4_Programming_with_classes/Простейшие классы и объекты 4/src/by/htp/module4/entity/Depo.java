package by.htp.module4.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Depo implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Train> trains;

    {
        trains = new ArrayList<Train>();
    }

    public Depo() {
        super();
    }

    public Depo(int n) {

    }

    public void setTrains(List<Train> trains){
        this.trains = trains;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (o == null)
            return false;
        if (!(o instanceof Depo)) {
            return false;
        }

        Depo depo = (Depo) o;

        if (depo.trains == trains) {
            return true;
        }

        return depo.trains.equals(trains);

    }

    @Override
    public int hashCode() {

        int result = 17;

        result = 31 * result + ((trains == null) ? 0 : trains.hashCode());
        return result;
    }

    @Override
    public String toString() {

        StringBuilder string = new StringBuilder();
        String delimeter = "\n";
        for (Train train : trains) {
            string.append(train.toString());
            string.append(delimeter);

        }
        return string.toString();
    }
}
