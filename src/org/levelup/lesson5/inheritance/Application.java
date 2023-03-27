package org.levelup.lesson5.inheritance;

public class Application {
    public static void main(String[] args) {
        Account account = new Account();
        account.number = "2232311111";

        DepositAccount deposit = new DepositAccount();
        deposit.number = "34321333";
        deposit.rate = 44.44;

        System.out.println("Basic number " + account.number);
        System.out.println("Deposit number "+ deposit.number);

        CreditCardAccount creditCardAccount = new CreditCardAccount();


    }
}
