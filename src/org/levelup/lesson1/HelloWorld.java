package org.levelup.lesson1;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Second line");

        System.out.println(54.34);

        // Create var
        int var;
        // Move var
        var = 596;

        // Инициализация переменной
        int secondVar = 486;

        int sum = var + secondVar;

        int sumSum;
        sumSum = sum + secondVar + 15;

        System.out.println(sum);
        System.out.println(sum+ 100);

        System.out.println("SumSum = " + sumSum);

        int a = 10;
        int b = 10;
        System.out.println(a + b + " = result");

        // перевод в строку
        // 1. компилятор видит "result = " и переводитт все что после + в строки
        System.out.println("result = " + a + b);
        // страка + ( сложение интов)
        System.out.println("result = " + (a + b));

    }
}
