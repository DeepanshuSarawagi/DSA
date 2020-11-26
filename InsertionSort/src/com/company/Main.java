package com.company;

public class Main {

    /*
    Insertion Sort algorithm is also an in-place algorithm like Bubble Sort and Selection Sort
    It has a time complexity of quadratic. Which means for every 100 elements, it would take 10,000 steps to sort them
    The Big O notation value is O(n^2).
    It is a stable algorithm, which means we the position of two identical elements in an array will not be changed
    while performing sort operation.

    How does Insertion Sort algorithm work?
    In this case, we will assume that the first index position of array is already sorted. Hence the firstUnsortedIndex
    will be set to 1. We will then compare the element at position 1 with the element in position 0. If the element at
    position 1 is greater than element at position 0, the firstUnsortedIndex will be updated to position 2. If not, the
    element at position 0 will be shifted right (to position 1) and the unsorted element will be inserted at position 0.

     */

    public static void main(String[] args) {
	    int[] intArray = {20, 35, -15, 7, 55, 1, -22};


	    for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex ++) {

	        int newElement = intArray[firstUnsortedIndex];
	        int i;
	        for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i-1];
            }
	        intArray[i] = newElement;
        }

	    for (int j : intArray) {
			System.out.println(j);
		}
    }
}
