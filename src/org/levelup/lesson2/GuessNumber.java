package org.levelup.lesson2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        // 1. Есть возможность вводить числа с клавиатуры
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        // nextInt останавливает программу в ожидание ввода
        int enteredNumber = sc.nextInt();
        System.out.println("Вы введи число: "+ enteredNumber);

        // 2. Программа сама загадывает число
        Random rnd = new Random();
        // ничего общего с sc.nextInt() не имеет
        int secretNumber = rnd.nextInt(6); // [0, 5) : [0, 4] - ) означает не включается в диапозон
//        int secretNumber = rnd.nextInt(11) - 5; // [-5, 6) : [-5, 5] - ) означает не включается в диапозон
        System.out.println("Секретное число: "+ secretNumber);

//        boolean guessed = enteredNumber == secretNumber; // == это сравнение

        if(enteredNumber == secretNumber){
            System.out.println("Вы угадали число!");
        }else if(secretNumber > enteredNumber) {
            System.out.println("Вы не угадали!");
        }


    }
}
