package org.darmokhval.tasks3and4;

import java.util.Arrays;

public class task4 {

    public static int multiArithmeticElements(int amount, int firstEl, int step) {
        int sum = firstEl;
        for (int i = 1; i < amount; i++) {
            firstEl += step;
            sum = sum * firstEl;
        }
        return sum;
    }

    public static double sumGeometricElements(int initEl, double progressionStep, int alim) {
        double sum = 0.0;
        double elem = initEl;
        while (elem > alim) {
            sum += elem;
            elem = elem * progressionStep;
        }
        return sum;
    }

    public static void transform(int[] array, SortOrder order) {
        if (isSorted(array, order)) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] + i;
            }
        }
    }

    public enum SortOrder {
        ASC, DESC
    }

    public static boolean isSorted(int[] array, SortOrder order) {

        boolean sorted = true;

        switch (order) {
            case ASC:
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        sorted = false;
                        break;
                    }
                }
                break;

            case DESC:
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        sorted = false;
                        break;
                    }
                }
        }
        return sorted;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] array2 = {44, 43, 42, 41, 40, 39, 33, 22, 11};
        System.out.println(multiArithmeticElements(4, 5, 3));
        System.out.println(isSorted(array, SortOrder.DESC));
        System.out.println(sumGeometricElements(645, 0.2, 43));
        System.out.println(Arrays.toString(array2));
        transform(array, SortOrder.ASC);
        System.out.println(Arrays.toString(array));
    }
}
