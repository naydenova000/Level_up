package org.levelup.lesson5.inheritance;

public class Account {

    String number;

    double balance;

    public void enrollPayment(double amount){
        balance += amount;
    }
}
