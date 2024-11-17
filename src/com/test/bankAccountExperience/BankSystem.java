package com.test.bankAccountExperience;



public class BankSystem {
 public static void main(String[] args) {

     BankAccount account = new BankAccount(1500.00);
     account.deposit(220);
     account.withdraw(170);
     account.deposit(550);
     account.withdraw(350);
     account.printStatement();
 }
}