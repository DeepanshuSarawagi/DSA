package com.company;

public class RecursiveFactorial {

    public static void main(String[] args) {

        System.out.println(recursiveFactorial(20));
    }

    public static long recursiveFactorial (long num) {

        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);

    }
}
