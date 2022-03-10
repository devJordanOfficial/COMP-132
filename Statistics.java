package me.jordan;

import java.util.Arrays;

public class Statistics {

    public Statistics() {
        start();
    }

    private static void start() {
        String[][] names = {
                { "Ewell", "Nate" },
                { "Smurthwaite", "Adelina" },
                { "Bernollet", "Maryjane" },
                { "Chalfain", "Karlis" },
                { "Huckabe", "Almire" }
        };

        double[][] grades = {
                { 3.83, 9.21, 9.25, 0.84, 1.40, 7.90, 1.41, 5.15 },
                { 5.09, 3.66, 3.04, 3.02, 8.59, 2.34, 8.86, 7.40 },
                { 5.35, 0.85, 8.56, 7.37, 2.78, 3.19, 2.04, 5.70 },
                { 9.25, 9.62, 7.08, 7.27, 9.86, 5.88, 9.86, 9.70 },
                { 3.39, 2.75, 1.23, 1.04, 3.87, 8.72, 4.60, 6.21 }
        };

        String[] fullNames = getFullNames(names);
        double[] gpas = calculateGpas(grades);
        print(fullNames, gpas, calculateAverage(gpas));

    }

    private static String[] getFullNames(String[][] names) {
        String[] result = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            result[i] = names[i][1] + " " + names[i][0];
        }

        return result;
    }

    private static double[] calculateGpas(double[][] grades) {
        double gpa;
        double[] classGpa = new double[grades.length];

        for (int i = 0; i < grades.length; i++) {
            gpa = 0;
            for (double grade : grades[i]) {
                gpa += grade;
            }
            gpa /= grades[i].length;
            classGpa[i] = gpa;
        }

        return classGpa;
    }

    private static double calculateAverage(double[] grades) {
        double result = 0;

        for (double grade : grades) {
            result += grade;
        }

        return result / grades.length;
    }

    private static void print(String[] names, double[] gpas, double average) {
        System.out.println("Student GPAs:");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s: %.2f%n", names[i], gpas[i]);
        }
        System.out.printf("%nClass average: %.2f", average);
    }

}
