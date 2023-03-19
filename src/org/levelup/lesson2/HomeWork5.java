package org.levelup.lesson2;

import java.util.Random;

public class HomeWork5 {
    public static void main(String[] args) {
        // 3,9,-1 -> ok
        //2,4,5 -> не ок, почему то не выводиться результат выполнения
        // 7,0,-5 -> не ок, почему то не выводиться результат выполнения
        int a = 7, b = 0, c = -5;

       if (a < b && a < c && b < c){
           System.out.println("Возрастающая последовательность:" + a + "," + b + "," + c);
       } else if (b < a && b < c && a < c ){
           System.out.println("Возрастающая последовательность: " + b+ "," + c + "," + a);
       } else if (c < a && c < b && a < b ) {
           System.out.println("Возрастающая последовательность: " + c +  "," + a + "," + b);
       }
    }
}
