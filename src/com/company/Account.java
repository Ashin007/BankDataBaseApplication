package com.company;

public abstract class Account implements IbaseIntrestRate {

    String name;
    String sSn;
    double balance;

    String accountNumber;
    double interestRate;
    static int  uniqueNumber = 10000;


    public Account(String name,String sSn,double deposit) {
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

        String lastSSN = sSn.substring(sSn.length()-2,sSn.length());
        int threeRandomNumber = (int) (Math.random()*(Math.pow(10,3)));
        return lastSSN+uniqueNumber+threeRandomNumber;
    }

    protected void showInfo(){
        System.out.println("Name: "+name+
                "\n"+"Account Number: "+accountNumber+"\n"+
                "Balance: "+balance+
                "\n Intrest Rate: "+interestRate);
    }
}
