package by.htp.module4.logic;

import by.htp.module4.entity.Train;

import java.util.ArrayList;
import java.util.List;

public class TrainLogic {

    public List<Train> sortByDestination(List<Train> trains) {

        List<Train> sortTrains = new ArrayList<Train>();
        sortTrains.addAll(trains);

        for (int i = 0; i < sortTrains.size(); i++) {
            for (int j = 0; j < sortTrains.size() - i - 1; j++) {
                if (sortTrains.get(j).getDestination().charAt(0) > sortTrains.get(j + 1).getDestination().charAt(0)) {
                    Train var = sortTrains.get(j);
                    sortTrains.set(j, sortTrains.get(j + 1));
                    sortTrains.set(j + 1, var);
                }
            }
        }
        for (int i = 0; i < sortTrains.size(); i++) {
            int j = 0;
            for (j = i + 1; j < sortTrains.size(); j++) {
                if (j != i && sortTrains.get(j).getDestination() != sortTrains.get(i).getDestination()) {
                    sortByTime(sortTrains, i, j);
                    i = j - 1;
                    break;
                }
            }
            if (j == sortTrains.size() && sortTrains.get(j - 1).getDestination() == sortTrains.get(i).getDestination()) {
                sortByTime(sortTrains, i, j);
                i = j - 1;
            }
        }
        return sortTrains;
    }

    public List<Train> sortByTime(List<Train> trains, int firstIndex, int lastIndex) {
        for (int i = 0; i < lastIndex - firstIndex; i++) {
            for (int j = firstIndex; j < lastIndex - i - 1; j++) {
                if (trains.get(j).getTime() < trains.get(j + 1).getTime()) {
                    Train var = trains.get(j);
                    trains.set(j, trains.get(j + 1));
                    trains.set(j + 1, var);
                }
            }
        }
        return trains;
    }

    public List<Train> sortByTrainNumber(List<Train> trains) {
        for (int i = 0; i < trains.size(); i++) {
            for (int j = 0; j < trains.size() - i - 1; j++) {
                if (trains.get(j).getTrainNumber() > trains.get(j + 1).getTrainNumber()) {
                    Train var = trains.get(j);
                    trains.set(j, trains.get(j + 1));
                    trains.set(j + 1, var);
                }
            }
        }
        return trains;
    }

    public Train getInfoTrainNumber(List<Train> trains, int trainNumber) {

        for (int i = 0; i < trains.size(); i++) {
            if (trains.get(i).getTrainNumber() == trainNumber) {
                return trains.get(i);
            }
        }
        return null;
    }
}
