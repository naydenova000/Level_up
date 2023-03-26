package org.levelup.lesson4;

public class PhoneApp {
    public static void main(String[] args) {
        Phone informationPhone = new Phone();
        informationPhone.number = "9121233322";
        informationPhone.model = "Samsung";
        informationPhone.weight = 186;
        System.out.println("Номер телефона " + informationPhone.number + " модель " +
                informationPhone.model + " вес " + informationPhone.weight);


        informationPhone.receiveCall("Петр");
        informationPhone.getNumber(informationPhone.number);

        informationPhone.receivePhoneCall("Витя", informationPhone.number);

        // Не понятно как сделать передачу значений массива??
        // Вывод На номер [Ljava.lang.Integer;@30f39991 было отправлено сообщение с номера [Ljava.lang.Integer;@30f39991
        informationPhone.sendMessages(new Integer[]{3232323, 1232323});
    }
}

