package org.levelup.lesson2;

import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        // for (foreach), while, do { } while();

        // 1. for - используется, когда есть конечное значение повторений цикла
        // for (<..>;<..>;<..>)
        // for (<инициализация>; <условие выполнения цикла>; <обновление>) - выполнение цикла называется итерация

        Random rnd = new Random();
        // ничего общего с sc.nextInt() не имеет
        int secretNumber = rnd.nextInt(5); // [0, 5) : [0, 4] - ) означает не включается в диапозон
        System.out.println("Случайное число: "+ secretNumber);

        // i - это счетчик
        for (int i = 0; i < secretNumber; i++){
            System.out.println("I = "+ i);
        }

        // while (conditions) { }
        String sentence = "Hello world. Java.";
        int symbolIndex = 0;
        while (sentence.charAt(symbolIndex) != '.'){
            System.out.println(symbolIndex);
            symbolIndex++;
        }
        System.out.println("Символов в предложении: " + symbolIndex);


        // do { } while()
//        do {
//            
//        }while ();


        int a = 5;
        if (a < 10){
            System.out.println("A less 5");
        }
        // Пока выполняется условие, выполняй цикл
        while (a < 10){
            System.out.println("A less 10");
            a +=1;
        }

        // выполнить условие цикла, хотя бы 1 раз
        do {
            System.out.println("Выполниться хотя бы 1 раз");
        } while (a > 1000);

        // while используется когда не знаешь сколько итераций необходимо(чтение файла
        // for когда знаешь сколько итераций необходимо, есть границы

        // for (<инициализация>; <условие выполнения цикла>; <обновление>) - выполнение цикла называется итерация
        // for используется с счетчиком
        for (int i = 0; i < 20; i++) {
            System.out.println("I love Java loops! i = " + i);
        }





    }
}
