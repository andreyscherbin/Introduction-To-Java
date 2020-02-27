package com.company;

import java.util.Scanner;

public class Calendar {

    private int year;
    private Day[] days;

    public enum DayOfWeek {

        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public enum Month {

        JANUARY {
            @Override
            public int getNumberDays() {
                return 31;
            }
        },
        FEBRUARY {
            @Override
            public int getNumberDays() {
                return 28;
            }
        },
        MARCH {
            @Override
            public int getNumberDays() {
                return 31;
            }
        },
        APRIL {
            @Override
            public int getNumberDays() {
                return 30;
            }
        },
        May {
            @Override
            public int getNumberDays() {
                return 31;
            }
        },
        June {
            @Override
            public int getNumberDays() {
                return 30;
            }
        },
        July {
            @Override
            public int getNumberDays() {
                return 31;
            }
        },
        August {
            @Override
            public int getNumberDays() {
                return 31;
            }
        },
        SEPTEMBER {
            @Override
            public int getNumberDays() {
                return 30;
            }
        },
        OCTOBER {
            @Override
            public int getNumberDays() {
                return 31;
            }
        },
        NOVEMBER {
            @Override
            public int getNumberDays() {
                return 30;
            }
        },
        DECEMBER {
            @Override
            public int getNumberDays() {
                return 31;
            }
        };

        public int getNumberDays() {
            return 30;
        }
    }

    private class Day {

        private int day;
        private int month;
        private String dayWeek;
        private String type;

        public Day() {
            day = 0;
            month = 0;
            dayWeek = "";
            type = "";
        }

        public Day(int day, int month, String dayWeek, String type) {
            this.day = day;
            this.month = month;
            this.dayWeek = dayWeek;
            this.type = type;
        }
    }

    public Calendar() {
        this.year = 0;
        this.days = null;
    }

    public Calendar(int year) {

        this.year = year;
        this.days = new Day[365];
        Month[] months = Month.values();
        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        int counterDays = 0;
        int counterDaysOfWeek = 0;
        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < months[i].getNumberDays(); j++) {
                days[j + counterDays] = new Day();
                days[j + counterDays].day = j + 1;
                days[j + counterDays].month = i + 1;
                days[j + counterDays].dayWeek = dayOfWeeks[counterDaysOfWeek].toString();
                if (dayOfWeeks[counterDaysOfWeek].toString() == DayOfWeek.SATURDAY.toString() || dayOfWeeks[counterDaysOfWeek].toString() == DayOfWeek.SUNDAY.toString()) {
                    days[j + counterDays].type = "Выходной день";
                } else {
                    days[j + counterDays].type = "Будний день";
                }
                counterDaysOfWeek++;
                if (counterDaysOfWeek == 7) {
                    counterDaysOfWeek = 0;
                }
            }
            counterDays += months[i].getNumberDays();
        }
    }

    public void printCalendar() {

        System.out.println("Календарь года: " + year);
        for (Day day : days) {
            System.out.println("day: " + day.day + " month: " + day.month + " dayOfWeek: " + day.dayWeek + " type: " + day.type);
        }
    }

    public void makeHolidayDay(int day, int month) {
        for (Day d : days) {
            if (d.day == day && d.month == month) {
                d.type = "Праздничный день";
            }
        }
    }
}