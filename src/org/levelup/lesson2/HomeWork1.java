package org.levelup.lesson2;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int enteredNumber = sc.nextInt();

        if (enteredNumber%2==0){
            System.out.println("Число четное " + enteredNumber );
        } else {
            System.out.println("Число нечетное " + enteredNumber);
        }


    }
}
