package org.levelup.lesson3;

public class ArrayExamples {
    public static void main(String[] args) {

        // 5 goods
        double price1 = 35.23;
        double price2 = 45.34;
        double price3 = 56.78;
        double price4 = 22.45;
        double price5 = 78.78;

        double price6 = 455.55;

        double sum = price1 + price2 + price3 + price4 + price5;
        System.out.println("Total price of all goods: " + sum);

        double avg = sum/5;
        System.out.println("Average price of all goods: " + avg);

        // int[] array;
        double[] prices = new double[6];

        prices[0] = price1;
        prices[1] = price2;
        prices[2] = price3;
        prices[3] = price4;
        prices[4] = price5;
        prices[5] = price6;

        double arrSum = 0;
        for (int i = 0; i < prices.length; i++){
            System.out.println(i + " -> value: " + prices[i]);
            arrSum = arrSum + prices[i];
        }
        System.out.println("Array: total price of all goods: "+ arrSum);

    }
}
