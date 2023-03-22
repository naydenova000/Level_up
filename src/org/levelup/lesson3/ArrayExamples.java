package org.levelup.lesson3;

public class ArrayExamples {
    public static void main(String[] args) {

        // 4 goods
        double price1 = 35.23;
        double price2 = 45.34;
        double price3 = 56.78;
        double price4 = 22.45;

        double avg = (price1 + price2 + price3 + price4) / 4;
        System.out.println("Total avg price of all goods: " + avg);


        // int[] array;
        double[] prices = new double[4];

        prices[0] = price1;
        prices[1] = price2;
        prices[2] = price3;
        prices[3] = price4;


        double arrSum = 0;
        for (int i = 0; i < prices.length; i++){
            System.out.println(i + " -> value: " + prices[i]);
            arrSum = arrSum + prices[i];
        }
        System.out.println("Array: total price of all goods: "+ arrSum);


        double sum = 0;
        for (int i =0; i < prices.length; i++){
            sum += prices[i];
        }
        System.out.println("Sum all price " + sum);
        double average = sum / prices.length;
        System.out.println("Avg rices: " + average);
    }
}
