package org.levelup.lesson4;

public class Application {
    public static void main(String[] args) {

        Account currentAccount = new Account();
        currentAccount.number = "133121122";
        currentAccount.currency = "RUB";
        currentAccount.amount = 343344.44;
        currentAccount.type = " CURRENT";

        currentAccount.displayBalance();
        currentAccount.enrollPayment(500, "EUR");
        currentAccount.displayBalance();

        Account taxAccount = new Account();
        taxAccount.number = "938371230";
        taxAccount.currency = "RUB";
        taxAccount.amount = 0.0;
        taxAccount.type = "BUDGET";

        System.out.println();
        taxAccount.displayBalance();

        boolean taxPaymentResult = currentAccount.makePayment(4545.4, taxAccount);
        System.out.println("Result tsx: " + taxPaymentResult);
        currentAccount.displayBalance();
        taxAccount.displayBalance();

        Account personAccount = new Account("3342234", "RUB", 232323.444);
        personAccount.displayBalance();

    }
}
