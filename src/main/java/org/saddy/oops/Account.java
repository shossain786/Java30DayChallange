package org.saddy.oops;

public class Account {
    private double balance;

    public Account(double depositAmount) {
        if (depositAmount < 10000) {
            System.out.println("Please provide initial deposit amount at least of RS: 10000/-");
            System.exit(0);
        }
        depositAmount(depositAmount);
    }

    public void depositAmount(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Please provide correct amount.");
            return;
        }
        balance += depositAmount;
    }

    public double getBalance() {

        return balance;
    }
}
