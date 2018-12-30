package com.company;

public abstract class Account implements IbaseIntrestRate {

    private String name;
    private String sSn;
    private double balance;

    String accountNumber;
    double interestRate;
    private static int  uniqueNumber = 10000;


    Account(String name, String sSn, double deposit) {
       // System.out.println("Account Created");
       // System.out.println("Account"+name);
        this.name = name;
        this.sSn = sSn;
        this.balance = deposit;

        //System.out.println(name+sSn+balance);

        //set AccountNumber
        this.accountNumber = setAccountNumber();


    }

    abstract void setRate();

    private String setAccountNumber(){

        uniqueNumber++;

        String lastSSN = sSn.substring(sSn.length()-2);
        int threeRandomNumber = (int) (Math.random()*(Math.pow(10,3)));
        return lastSSN+uniqueNumber+threeRandomNumber;
    }

    //common bank function

    void withdraw(int amount){

        balance = balance - amount;
        System.out.println("Withdraw Success Balance Amount Is: "+balance);
    }

    void deposit(int amount){

        balance = balance + amount;
        System.out.println("Deposit Success Balance Amount Is: "+balance);

    }
    protected void transfer(String toWhere,int amount){
        balance = balance - amount;
    }
    protected void showBalance(){
        System.out.println("Balance: "+balance);
    }

    protected void showInfo(){
        System.out.println("Name: "+name+
                "\n"+"Account Number: "+accountNumber+"\n"+
                "Balance: "+balance+
                "\n Intrest Rate: "+interestRate);
    }
}
