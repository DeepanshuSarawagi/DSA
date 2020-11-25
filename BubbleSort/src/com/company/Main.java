package com.company;

public class Main {
    /*
    Bubble Sort algorithm is a stable algorithm. It has a quadratic time complexity =, hence, one of the least efficient
    sorting algorithms in place.
    The Big(O) notation is n^2, hence, makes the time complexity as quadratic. For sorting 100 items, we would need to
    loop 10000 times to sort an array.
     */

    public static void main(String[] args) {
//        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int[] intArray = {5, 9, -3, 9, 4, 1, -8};

        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
            for (int i=0; i<lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i+1]) {
                    swapElement(intArray, i, i+1);
                }
            }
        }

        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void swapElement(int[] array, int i, int j) {
        if (i==j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
