package org.levelup.lesson3;

public class UniversityApplication {
    public static void main(String[] args) {

        String shortName = "СПБГУ";
        int foundationYear = 1724;

        String shortNameMgu = "МГУ";
        int foundationYearMgu = 1755;

        String[] shortNames;
        int[] years;

        // переменная класса(type) University
        // Объект класса University
        // Ссылка, экземпляр
        University spbgu = new University();
        // Задали значение полей у объекта
        spbgu.shortName = "СПБГУ";
        spbgu.foundationYear = 1724;

        //System.out.println(spbgu.shortName + " " + spbgu.foundationYear);
        spbgu.printUniversityInfo();

        University mgu = new University();
        mgu.shortName = "МГУ";
        mgu.foundationYear = 1755;

        mgu.printUniversityInfo();
        //System.out.println(mgu.shortName + " " + mgu.foundationYear);
        // Объект массива
//        University[] universities = new University[2];
//        universities[0]= spbgu;
//        universities[1] = mgu;
//        universities[2] = new University();



    }
}
