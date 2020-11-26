package com.company;

public class Main {

    /*
    Selection sort is again an in-place sort algorithm.
    It has the time complexity of O(n^2) time complexity - which means quadratic
    For an array consisting of 100 items, we need to perform 10000 steps to sort it
    Doesn't require as much swapping as bubble sort
    It is an Unstable sort, meaning, if there are two identical elements in an array, the position of those elements
    can be swapped.

    In this algorithm, we will fix the largest element in array to index 0 and then compare it with rest of the elements.
    If the largest element is found at other index position, then will update the largest variable to that index
    position and then swap the last element of array with the element at largest index.
    We will then continue the loop until we have sorted the entire array.
     */

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 1, 55, -22};
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for (int i =1; i<=lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                    System.out.println(largest);  // TODO Remove this after code test
                }
            }
            swapElements(intArray, largest, lastUnsortedIndex);
            for (int j : intArray) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int j : intArray) {
            System.out.println(j);
        }

    }

    public static void swapElements(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        if (array[i] > array[j]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
