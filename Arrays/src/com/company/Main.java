package com.company;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        for (int i=0; i<7; i++) {
            intArray[i] = i + 10;
        }

        // Printing the elements of array
        for (int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
