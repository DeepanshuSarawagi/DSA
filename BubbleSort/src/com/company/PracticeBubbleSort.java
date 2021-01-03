package com.company;

public class PracticeBubbleSort {

    public static void main(String[] args) {
        int[] intArray = {22, 67, 290, -19, 75, 99, 125, -89, -6};

        for (int lastUnsortedPartition = intArray.length - 1; lastUnsortedPartition > 0; lastUnsortedPartition--) {
            for (int i=0; i<lastUnsortedPartition; i++) {
                if (intArray[i] > intArray[i+1]) {
                    swapElements(intArray, i, i+1);
                }
            }
        }

        for (int i : intArray) {
            System.out.println(i);
        }
    }

    public static void swapElements(int[] Array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = Array[i];
        Array[i] = Array[j];
        Array[j] = temp;
    }
}
