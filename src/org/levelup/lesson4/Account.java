package org.levelup.lesson4;

public class Account {

    String number;

    String currency;

    double amount;

    String type;

    Account(){}

    Account(String number, String currency, double amount){
        this.number = number;
        this.currency = currency;
        this.amount = amount;
        this.type = "CURRENT";

    }

    void displayBalance(){
        System.out.println("Number " + number + " - amount: " + amount + " " + currency);
    }

    void enrollPayment(double paymentAmount, String paymentCurrency){
        if(paymentCurrency.equals(currency)){
            amount += paymentAmount;
        } else {
            amount += paymentAmount * 70;
        }

    }

    boolean makePayment(double paymentAmount, Account targetAccount) {
        if(paymentAmount > amount){
            return  false;
        }
        targetAccount.enrollPayment(paymentAmount, currency);
        amount -= paymentAmount;

        return true;
    }

}
