package com.company;

public class Main {

    /*
    Arrays are stored as one contiguous block in memory.
    By that we mean, lets say if we have an array of 100 items and the memory address of first item is at position
    100, and the size is 200 bytes then the entire length would be for 200 bytes starting from memory address 100.
    Therefore, we can say that the array items are not scattered in memory.

    Every element occupies the same amount of space in memory. For example, in Java, an int is 4 bytes long. Hence,
    every element of int array will occupy 4 bytes of space in memory.

    if the memory starts at memory address x and there are y elements in array and if we know the index of the starting
    element, then we can find the memory address of the ith element using the following expression (x + i*y)
     */

    public static void main(String[] args) {
        int[] intArray = new int[7];

        for (int i=0; i<7; i++) {
            intArray[i] = i + 15;
        }

        // Printing the elements of array
        for (int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
