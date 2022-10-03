package com.account;

import java.util.Scanner;

public class AccountTest {
    public static void main (String args[]){
        Account account1 = new Account (50.00);
        Account account2 = new Account (-7.53);

        System.out.println("Account1 Balance: " +account1.getBalance());
        System.out.println("Account2 Balance: " +account2.getBalance());

        Scanner input = new Scanner( System.in );
        double depositAmount;
        double debitAmount;
        System.out.println( "Enter deposit amount for account1: " ); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.println( "adding account1 balance "+depositAmount );
        account1.credit( depositAmount ); // add to account1 balance
// display balances
        System.out.println( "Account1 balance: "+ account1.getBalance() );
        System.out.println( "Account2 balance: "+account2.getBalance() );

        System.out.println( "Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.println( "Adding account2 balance " +depositAmount );
        account2.credit( depositAmount ); // add to account2 balance

// display balances
        System.out.println( "Account1 balance: " +account1.getBalance() );
        System.out.println( "Account2 balance: " +account2.getBalance() );

        System.out.println( "Enter debit amount for account1: " );
        debitAmount = input.nextDouble();
        System.out.println( "Subtracting from account1 balance"+debitAmount );
        if (account1.getBalance()>=debitAmount) {
            account1.debit( debitAmount );
            System.out.println( "Account1 balance: " +account1.getBalance() );
            System.out.println( "Account2 balance: " + account2.getBalance() );
        }
        else {
            System.out.println("Debit amount exceeded account balance ");
        }

// display balances
        System.out.println( "Enter debit amount for account2: " );
        debitAmount = input.nextDouble();
        System.out.println( "Subtracting account2 balance"+ debitAmount );
        if (account1.getBalance()>=debitAmount) {
            account1.debit( debitAmount );
            System.out.println( "Account1 balance: " +  account1.getBalance() );
            System.out.println( "Account2 balance: " +account2.getBalance() );
        }
        else {
            System.out.println("Debit amount exceeded account balance : ");
        }
    }
}

