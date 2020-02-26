package com.company;

public class Main {

    /*
     * Создать объект класса Государство, используя классы Область, Район, Город. Методы:вывести на консоль столицу,
     * количество областей, площадь, областные центры.
     */
    public static void main(String[] args) {

        Town[] towns = {new Town("Великие Луки", 10), new Town("Вольно", 20), new Town("Городище", 30)};
        District district = new District("Барановичский район", towns);
        Region region = new Region("Бресткая область", new Town("Брест", 1000), new District[]{district});
        State state = new State("Республика Беларусь", new Town("Минск", 2000), new Region[]{region});
        System.out.println(state.getNameCapital());
        System.out.println(state.getCountRegions());
        System.out.println(state.getAreaState());
        state.printNameRegions();
    }
}

