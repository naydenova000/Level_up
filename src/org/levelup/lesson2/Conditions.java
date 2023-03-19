package org.levelup.lesson2;

public class Conditions {
    // psvm
    public static void main(String[] args) {
        // sout System.out.println();

        int a = 6756;
        int b = 6;

        int m = a * b;

        boolean condition = m > 100000; // a >b => boolean

        if (condition) {
            System.out.println("Multiplication result greater than 100 000");
        } else {
            System.out.println("Multiplication result less than 100 000");

        }

        System.out.println("Multiplication result " + m);
    }
}
