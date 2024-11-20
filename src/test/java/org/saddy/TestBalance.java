package org.saddy;

import org.saddy.oops.Account;

public class TestBalance {
    public static void main(String[] args) {
        Account account = new Account(10000);

        System.out.println(account.getBalance());
        account.depositAmount(1200);
        System.out.println(account.getBalance());
    }
}
