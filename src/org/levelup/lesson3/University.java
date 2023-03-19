package org.levelup.lesson3;

public class University {

    // описание что будет использоваться в объектах
    // Переменная класса - поле класса (field)
    String shortName;
    int foundationYear;

    // тип возвращаемого значения - void - означает, метод не имеет результатов
    // название метода
    // (): внутри перечисление аргументов (параметров) метода
    // {}- тело метода

    void printUniversityInfo(){
        System.out.println(this.shortName + " " + foundationYear);
    }


}
