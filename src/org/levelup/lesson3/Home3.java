package org.levelup.lesson3;

import java.util.Random;


public class Home3 {
    public static void main(String[] args) {
        Random randNumber = new Random();
        int[] randomList = new int[8];
        int count = 0;

        for( int i = 0; i< randomList.length;i++){
            randomList[i] = randNumber.nextInt(21) + - 10;
            System.out.println(randomList[i]);
            if(randomList[i] < 0){
                count++;
            }
        }
        System.out.println("Количество отрицательных = " + count);


    }
}
