package org.levelup.lesson2;

public class HomeWork6 {
    public static void main(String[] args) {
        int startVal = 1000;
        int finishVal = 10000;

        int count = 3;

        while (startVal < finishVal){
            startVal += count;
            System.out.println(startVal);
        }
    }
}
