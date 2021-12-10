package com.michellegray;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    //constructors
    public BankAccount() {
        //This constructor sets default parameters calling the next constructor
        this(12345, 1.50, "Dobby", "Dobby@hogwarts.com", "1234000999000");
        System.out.println("Empty constructor called");
    }
    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail,
                       String customerPhoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    //Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    //Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double depositFunds){
        this.balance += depositFunds;
        System.out.println("You have deposited " + depositFunds + " , and your balance is " + balance);
    }

    public void withdrawFunds(double withdrawFunds){
        if(balance >= withdrawFunds){
            this.balance -= withdrawFunds;
            System.out.println("You have withdrawn " + withdrawFunds + " ,and your balance is " + balance);
        } else {
            System.out.println("Not enough funds available");
        }
    }
}
