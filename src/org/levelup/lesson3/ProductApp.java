package org.levelup.lesson3;

public class ProductApp {
    public static void main(String[] args){

        double [] prices;
        String[] names;
        double[] weights;
        String[] categories;

        // new - определяет сколько памяти необходимо
        // ищет и резервирует памят, под объект
        // сохраняет в переменной ссылку на выделенную память
        Product laptop = new Product(); // инициализировали объект
        laptop.price = 456.33;
        laptop.name = "Mac";

        Product computer = new Product();
        computer.price = 1245.99;

        System.out.println("Price first item: " + laptop.price);
        System.out.println("Name first item: " + laptop.name);

        System.out.println("Price second item: " + computer.price);
//        System.out.println("Name first item: " + laptop.name);

    }
}
