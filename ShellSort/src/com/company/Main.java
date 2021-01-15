package com.company;

public class Main {

    /**
     * Insertion sort algorithm chooses which element to insert using a gap of 1
     * Shell sort starts out using a larger gap value
     * As the algorithm runs, the gap reduces
     * In this implementation we will use the gap value of array.length/2
     * Shell sort is an unstable algorithm unlike insertion sort
     */

    public static void main(String[] args) {

	    int[] intArray = {-20, 89, 96, -71, 105, 692, -897};

	    for (int gap = intArray.length/2; gap > 0; gap /= 2) {

	        for (int i = gap; i < intArray.length; i++) {
	            int newElement = intArray[i];

	            int j = i;
	            while (j >= gap && intArray[j - gap] > newElement) {
	                intArray[j] = intArray[j-gap];
	                j-=gap;
                }
	            intArray[j] = newElement;

                System.out.println("Array after sort is now: ");
                for (int k : intArray) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }


	    for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
