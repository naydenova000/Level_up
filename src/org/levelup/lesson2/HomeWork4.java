package org.levelup.lesson2;

import java.util.Random;

public class HomeWork4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(901)+98;

        int n1 = randomNumber / 100;
        int n2 = randomNumber % 100 / 10;
        int n3 = randomNumber % 10;

        if ( n1 > n2 && n1 > n3){
            System.out.println(" В числе " + randomNumber + " наибольшая цифра " + n1 + " .");
        } else if (n2 > n1 && n2 > n3){
            System.out.println(" В числе " + randomNumber + " наибольшая цифра " + n2 + " .");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(" В числе " + randomNumber + " наибольшая цифра " + n3 + " .");
        } else {
            System.out.println("Полученное число не трехзначное!");
        }
    }
}
