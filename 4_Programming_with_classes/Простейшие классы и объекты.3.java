package com.company;

public class Main {

    /*
     * Создайте класс с именем Student, cодержащий поля:фамилия и инициалы, номер группы, успеваемость(массив из пяти
     * элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров
     * групп студентов, имеющих оценки, равные только 9 или 10.
     */
    private static class Student {

        private String surname, initials;
        private int groupNumber;
        private int progress[] = {0, 0, 0, 0, 0};

        Student(String surname, String initials, int groupNumber, int progress[]) {
            this.surname = surname;
            this.initials = initials;
            this.groupNumber = groupNumber;
            for (int i = 0; i < progress.length; i++) {
                this.progress[i] = progress[i];
            }
        }

        private void printSurnameAndGroupNumber() {
            System.out.printf("surname = %s, groupNumber = %d\n", surname, groupNumber);
        }

        private boolean isGoodStudent() {
            for (int i = 0; i < progress.length; i++) {
                if (progress[i] < 9) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

        Student[] massive = {new Student("Orlov", "A.B", 150501, new int[]{1, 2, 3, 4, 5}),
                new Student("Orlov", "A.B", 150501, new int[]{5, 6, 7, 8, 9}),
                new Student("Ivanov", "C.D", 150502, new int[]{9, 8, 8, 9, 9}),
                new Student("Petrov", "E.G", 150503, new int[]{10, 10, 10, 10, 10}),
                new Student("Yrochkin", "G.B", 150504, new int[]{7, 6, 5, 4, 3}),
                new Student("Konchikov", "H.M", 150505, new int[]{2, 3, 7, 8, 9}),
                new Student("Matrosov", "T.T", 150506, new int[]{10, 10, 9, 9, 10}),
                new Student("Anopkin", "Y.Y", 150507, new int[]{8, 8, 8, 8, 8}),
                new Student("Setochkin", "H.Y", 150508, new int[]{9, 10, 9, 10, 9}),
                new Student("Maliwkin", "E.M", 150509, new int[]{8, 9, 9, 10, 9})};
        for (Student student : massive) {
            if (student.isGoodStudent()) {
                student.printSurnameAndGroupNumber();
            }
        }
    }
}
