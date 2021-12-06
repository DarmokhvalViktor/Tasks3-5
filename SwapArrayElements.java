package org.darmokhval.tasks3and4;

public class SwapArrayElements {
    public static void main(String[] args) {
        int[] array = {100, 2, 3, 45, 33, 8, 4, 54};

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            if (array[i] % 2 == 0 && array[array.length - i - 1] % 2 == 0) {
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }

        for(int i: array) {
            System.out.print(i + " ");
        }
    }
}
