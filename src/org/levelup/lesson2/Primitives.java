package org.levelup.lesson2;

public class Primitives {
    public static void main(String[] args) {

        // Приведение типов
        // 1а. Явное
        // 2а. Неявное

        // 1b. Сужающее преоброзования
        // 2b. Расширяющее преоброзование

        int intVariable = 10;
        long longVariable = intVariable; // Приведение типов

         int fromLongVariable = (int) longVariable; // Приведение типов: явное/сужающее

        int a = 19;
        int b = 5;
        int c = a / b;

        double d1 = 34.43;
        int i1 = 34;
        int result1 = (int) (d1 + i1); // double + int  -> double

        int i10 = 15;
        int i11 = 4;
        double result2 =  i10 / i11; // 1 - деление(получаем int 3) 2. Преоброзование int -> double

        int var = 10;
        // ++, -- инкремент/дикремент на одном значние
        // ver ++ -> var = var +1
        // var -- -> var = var - 1

        // ++var префиксный инкремент/var++ постфиксный инкремент

        int r = 10;
        int sum = r + ++var; // 21
        // var = var + 1
        // sum = r + var

        int sum2 = r + var++;// 20
        // sum = r + var
        // var = var + 1 - отрабатывает после всех операций в выражених


    }
}
