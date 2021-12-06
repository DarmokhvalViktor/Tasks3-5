package org.darmokhval.tasks3and4;

public class Distance {

    public static int getMaxDistance(int[] array) {
        int firstOcc = 0;
        int lastOcc = 0;
        int maxElement = array[0];
        int maxDistance = 0;

        for (int i = 1; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
                firstOcc = i;
            }
        }

        for (int i = firstOcc; i < array.length; i++) {
            if (array[i] == maxElement) {
                lastOcc = i;
            }
        }

        if(lastOcc - firstOcc > maxDistance) {
            maxDistance = lastOcc - firstOcc;
        }
        return maxDistance;
    }
}
