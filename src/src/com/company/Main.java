package com.company;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String[] names = {"Vova", "Petya", "Katya", "Olya", "Diana"};
        int n = 5;
        int[] assessments = new int[n];

        Student[] students = new Student[n];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                assessments[j] = rand.nextInt(n + 1);
            }
            students[i] = new Student(names[i], assessments.clone());
            System.out.println(students[i].toString());
        }
        System.out.println("---------------");
        System.out.println(Arrays.toString(students));


        double[] avgsForStudent = new double[n];
        double avgForStudents;
        double avg;
        for (int i = 0; i < n; i++) {
            avgsForStudent[i] = students[i].average();
            System.out.println("Средняя оценка по студенту " + students[i].getName() + ": " + avgsForStudent[i]);
        }
        System.out.println("---------------");

        avgForStudents = Arrays.stream(avgsForStudent).average().orElse(Double.NaN);
        System.out.println("Средняя для всех студентов: " + avgForStudents);

    }
}
