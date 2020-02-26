package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    /*
     * Создать объект класса Государство, используя классы Область, Район, Город. Методы:вывести на консоль столицу,
     * количество областей, площадь, областные центры.
     */

    private static class State {

        String nameState;
        Town capital;
        Region[] regions;

        State(String nameState, Town capital, Region[] regions) {
            this.nameState = nameState;
            this.capital = capital;
            this.regions = regions;
        }

        private String getNameCapital() {
            return capital.getNameTown();
        }

        private int getCountRegions() {
            return regions.length;
        }

        private int getAreaState() {
            int areaState = 0;
            for (Region region : regions) {
                areaState += region.getAreaRegion();
            }
            return areaState;
        }

        private void printNameRegions() {
            for (Region region : regions) {
                System.out.println(region.getNameRegion());
            }
        }
    }

    private static class Region {

        String nameRegion;
        Town regionalCentr;
        District[] districts;

        Region(String nameRegion, Town regionalCentr, District[] districts) {
            this.nameRegion = nameRegion;
            this.regionalCentr = regionalCentr;
            this.districts = districts;
        }

        private int getAreaRegion() {
            int areaRegion = 0;
            for (District district : districts) {
                areaRegion += district.getAreaDistrict();
            }
            return areaRegion;
        }

        private String getNameRegion() {
            return nameRegion;
        }
    }

    private static class District {

        String nameDistrict;
        Town[] towns;

        District(String nameDistrict, Town[] towns) {
            this.towns = towns;
            this.nameDistrict = nameDistrict;
        }

        private int getAreaDistrict() {
            int areaDistrict = 0;
            for (Town town : towns) {
                areaDistrict += town.getAreaTown();
            }
            return areaDistrict;
        }
    }

    private static class Town {

        String nameTown;
        int area;

        Town(String nameTown, int area) {
            this.nameTown = nameTown;
            this.area = area;
        }

        private String getNameTown() {
            return nameTown;
        }

        private int getAreaTown() {
            return area;
        }
    }

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

