package com.bank.AccountExperience;


import java.util.Date;



class Transaction {
    private String type;     
    private double amount;   
    private Date date;        
    private double balance;  

   
    public Transaction(String type, double amount, Date date, double balance) {
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.balance = balance;
    }


    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public double getBalance() {
        return balance;
    }

    // Print the transaction details
    public void printTransaction() {
        System.out.printf("%-15s %-15s %-15s %-10.2f\n", type, date.toString(), String.format("%.2f", amount), balance);
    }
}



