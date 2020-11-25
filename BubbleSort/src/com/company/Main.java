package com.company;

public class Main {

    public static void main(String[] args) {

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
