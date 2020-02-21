package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    /*
     * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
     * периметра и точки пересечения медиан.
     */
    private static class Triangle {

        private double AB, AC, BC;

        Triangle(double AB, double AC, double BC) {
            this.AB = AB;
            this.AC = AC;
            this.BC = BC;
        }

        private double area() {
            double halfPerimeter = perimeter() / 2;
            return Math.sqrt(halfPerimeter * (halfPerimeter - AB) * (halfPerimeter - AC) * (halfPerimeter - BC));
        }

        private double perimeter() {
            return AB + AC + BC;
        }

        private void median() {
            double medianA = 0, medianB = 0, medianC = 0;
            medianA = (Math.sqrt(2 * Math.pow(AC, 2) + 2 * Math.pow(AB, 2) - Math.pow(BC, 2))) / 2;
            medianB = (Math.sqrt(2 * Math.pow(AB, 2) + 2 * Math.pow(BC, 2) - Math.pow(AC, 2))) / 2;
            medianC = (Math.sqrt(2 * Math.pow(AC, 2) + 2 * Math.pow(BC, 2) - Math.pow(AB, 2))) / 2;
            System.out.printf("\nточка находится на расстоянии %f от вершины A, на расстоянии %f от вершины B," +
                    "на расстоянии %f от вершины C", (double) 2 / 3 * medianA, (double) 2 / 3 * medianB, (double) 2 / 3 * medianC);
        }
    }

    public static void main(String[] args) {

        Triangle triangle = new Triangle(4, 5, 7);
        System.out.printf("площадь равна = %f, периметр равен = %f", triangle.area(), triangle.perimeter());
        triangle.median();
    }
}
