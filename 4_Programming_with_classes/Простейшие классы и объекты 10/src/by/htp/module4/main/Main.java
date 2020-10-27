package by.htp.module4.main;

import by.htp.module4.entity.ControlRoom;
import by.htp.module4.entity.Airline;
import by.htp.module4.logic.AirlineLogic;
import by.htp.module4.view.AirlineView;

public class Main {

    /*
     * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set и get методы и метод
     * toString(). Создать второй класс, агрегирующий массив типа Airline, c подходящими конструкторами и методами. Задать
     * критерии выбора данных и вывести данные на консоль.
     *
     * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
     * Найти и вывести:
     * a) список рейсов для заданного пункта назначения;
     * b) список рейсов для заданного для недели;
     * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
     */
    public static void main(String[] args) {

        AirlineLogic airlineLogic = new AirlineLogic();
        AirlineView airlineView = new AirlineView();
        ControlRoom controlRoom = new ControlRoom();

        Airline airline1 = new Airline("moscow", 125, "boing", 19.00, "Monday");
        Airline airline2 = new Airline("berlin", 126, "boing", 19.25, "tuesday");
        Airline airline3 = new Airline("minsk", 127, "boing", 19.55, "wednesday");
        Airline airline4 = new Airline("vena", 128, "boing", 20.00, "friday");

        controlRoom.addAirline(airline1);
        controlRoom.addAirline(airline2);
        controlRoom.addAirline(airline3);
        controlRoom.addAirline(airline4);

        System.out.println(controlRoom);

        airlineView.print(airlineLogic.findAirlineListDayWeek("Monday", controlRoom.getAirlines()));
        airlineView.print(airlineLogic.findAirlineListDayWeek("Monday", 19, controlRoom.getAirlines()));
        airlineView.print(airlineLogic.findAirlineListDestination("berlin", controlRoom.getAirlines()));
    }
}
