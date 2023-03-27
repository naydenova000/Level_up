package org.levelup.lesson4;

public class Phone {
    String number;
    String model;
    double weight;

    Phone(String number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    Phone(){}

    void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    void getNumber(String number){
        System.out.println("Номер терелофа " + number);
    }

    void receivePhoneCall(String name, String number){
        System.out.println("Вызов от " + name + " по номеру " + number);
    }

    void sendMessages(String[] numbers){
        System.out.println("На номер "+ numbers + " было отправлено сообщение с номера " + numbers);
    }


}
