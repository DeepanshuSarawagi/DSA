package com.company;

public class selectionSortPractice {
    public static void main(String[] args) {
        int[] intArray = {190, 11, -90, -846, 25, 99, 901, 571};
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i=1; i<=lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
                System.out.println(largest);
            }
            swapElements(intArray, largest, lastUnsortedIndex);
        }

        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }

    public static void swapElements(int[] intArray, int i, int j) {
        if (i == j) {
            return;
        }

        if (intArray[i] > intArray[j]) {
            int temp = intArray[i];
            intArray[i] = intArray[j];
            intArray[j] = temp;
        }
    }
}
