package com.test.bankAccountExperience;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


class BankAccount {
 private double balance;            
 private List<Transaction> transactions;  


 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
     this.transactions = new ArrayList<>();
 }

 // Deposit money into the account
 public void deposit(double amount) {
     if (amount <= 0) {
         System.out.println("Deposit amount must be positive.");
         return;
     }
     balance += amount;
     transactions.add(new Transaction("Deposit", amount, new Date(), balance));
     System.out.println("Deposited: " + amount);
 }

 // Withdraw money from the account
 public void withdraw(double amount) {
     if (amount <= 0) {
         System.out.println("Withdrawal amount must be positive.");
         return;
     }
     if (amount > balance) {
         System.out.println("Insufficient funds.");
         return;
     }
     balance -= amount;
     transactions.add(new Transaction("Withdrawal", amount, new Date(), balance));
     System.out.println("Withdrawn: " + amount);
 }

 // Print the account statement
 public void printStatement() {
     System.out.println("\nAccount Statement:");
     System.out.printf("%-10s %-15s %-15s %-10s\n", "Type", "Date", "Amount", "Balance");
     for (Transaction transaction : transactions) {
         transaction.printTransaction();
     }
 }
 // Getter for the current balance
 public double getBalance() {
     return balance;
 }
}