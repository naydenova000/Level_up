package org.levelup.lesson3;

import java.util.Random;


public class Home4 {
    public static void main(String[] args) {
        Random randNumber = new Random();
        int[] randomList = new int[12];

        for( int i = 0; i< randomList.length;i++){
            randomList[i] = randNumber.nextInt(31) + - 20;
            System.out.println("List = " + randomList[i]);
            if(randomList[i] < 0){
                randomList[i] = 0;
            }
            System.out.println("new list without negative -> " + randomList[i]);

        }


    }
}
