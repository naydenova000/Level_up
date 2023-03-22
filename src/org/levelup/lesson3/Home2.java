package org.levelup.lesson3;

import java.util.Random;
import java.util.stream.IntStream;

public class Home2 {
    public static void main(String[] args) {

        int[] randomList = new int[7];
        for( int i = 0; i< randomList.length;i++){
            randomList[i] = (int) (Math.random()* 12);
            randomList[i] *=2;
            System.out.println(randomList[i]);
        }

    }
}
