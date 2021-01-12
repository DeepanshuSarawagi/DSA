package com.company;

public class insertionSortPractice {
    public static void main(String[] args) {

        int[] intArray = {-20, 57, -9, 69, 98, -110, 20, -900};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }
}
