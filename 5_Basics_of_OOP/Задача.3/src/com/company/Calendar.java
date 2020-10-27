package com.company;

import java.io.Serializable;
import java.util.Scanner;

public class Calendar implements Serializable {

    private static final long serialVersionUID = 1L;

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

    private class Day implements Serializable {

        private static final long serialVersionUID = 2L;

        private int day;
        private int month;
        private String dayWeek;
        private String type;

        public Day() {

        }

        public Day(int day, int month, String dayWeek, String type) {
            this.day = day;
            this.month = month;
            this.dayWeek = dayWeek;
            this.type = type;
        }

        @Override
        public boolean equals(Object o) {

            if (o == this) return true;
            if (!(o instanceof Day)) {
                return false;
            }

            Day day_object = (Day) o;

            return day_object.day == day &&
                    day_object.month == month &&
                    day_object.dayWeek.equals(dayWeek) &&
                    day_object.type.equals(type);
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + day;
            result = 31 * result + month;
            result = 31 * result + dayWeek.hashCode();
            result = 31 * result + type.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "День: " + day + " Месяц: " + month + " День недели: " + dayWeek + " Тип дня: " + type;
        }
    }

    public Calendar() {

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

    public boolean makeHolidayDay(int day, int month) {
        for (Day d : days) {
            if (d.day == day && d.month == month) {
                d.type = "Праздничный день";
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        for (Day day : days) {
            System.out.println(day);
        }
        return "Календарь года: " + year;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Calendar)) {
            return false;
        }

        Calendar calendar = (Calendar) o;
        return calendar.year == year;

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + year;
        return result;
    }
}