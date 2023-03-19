package org.levelup.lesson2;

import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {

        Random rnd = new Random();
        // ??? Не до конца поняла как задвать интервал, на уровне интуиции задала его так
        int a = rnd.nextInt(151)+ 5;
        if (a >= 25 && a <= 100 ){
            System.out.println("Число " + a + " содержиться в интервале");
        } else {
            System.out.println("Число " + a + " не содержиться в интервале");
        }
    }
}
