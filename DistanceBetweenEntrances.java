package org.darmokhval.tasks3and4;

import java.util.Arrays;

public class DistanceBetweenEntrances {
    public static void main(String[] args) {
        int[] array = {11, 1, 10, 10, 10, 11};
        int[][] matrix = {{2, 4, 3, 3}, {2, 1, 1, 1}, {5, 7, 8, 5}, {5, 9, 8, 4}};

        System.out.println(Arrays.deepToString(zerosAndOnes(matrix)));
        System.out.println(Distance.getMaxDistance(array));

    }

    public static int[][] zerosAndOnes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = matrix[i][j];
                }
                else if (i < j) {
                    matrix[i][j] = 1;
                }
                else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
