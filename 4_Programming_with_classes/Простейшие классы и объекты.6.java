package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Составьте описание класса для представления времени. Предусмотрите возможность установки времени и изменения его
     * отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
     * полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и
     * секунд
     */
    private static class Time {

        private int hour, minute, second;

        Time(int hour, int minute) {
            this.hour = hour;
            this.minute = minute;
            this.second = 0;
        }

        private void printTime() {
            System.out.println(hour + ":" + minute + ":" + second);
        }

        private boolean setHour(int hour) {
            if (hour >= 0 && hour <= 24) {
                this.hour = hour;
                return true;
            } else {
                this.hour = 0;
                return false;
            }
        }

        private boolean setMinute(int munute) {
            if (minute >= 0 && minute <= 60) {
                this.minute = minute;
                return true;
            } else {
                this.minute = 0;
                return false;
            }
        }

        private boolean setSecond(int second) {
            if (second >= 0 && second <= 60) {
                this.second = second;
                return true;
            } else {
                this.second = 0;
                return false;
            }
        }

        private void changeHour(int hour) {

            this.hour += hour;
            if (this.hour > 24) {
                this.hour %= 24;
            }
        }

        private void changeMinute(int minute) {
            this.minute += minute;
            if (this.minute >= 60) {
                changeHour(this.minute / 60);
                this.minute %= 60;
            }
        }

        private void changeSecond(int second) {

            this.second += second;
            if (this.second >= 60) {
                changeMinute(this.second / 60);
                this.second %= 60;
            }
        }
    }

    public static void main(String[] args) {

        Time time = new Time(15, 15);
        time.changeHour(96);
        time.changeMinute(120);
        time.changeSecond(3600);
        time.printTime();
    }
}
