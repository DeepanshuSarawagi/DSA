package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(iterativeFactorial(10));

    }

    public static long iterativeFactorial(long num) {
        if (num == 0) {
            return 1;
        }
        long factorial = 1;
        for (long i=1; i<=num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
