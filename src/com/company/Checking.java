package com.company;

public class Checking extends Account {

    //properties specific to checking account

    int debitCardNumber;
    int debitCardPin;


    //constructor


    public Checking(String name,String sSn,double deposit) {
        super(name,sSn,deposit);
       // System.out.println("Checking Account Created");
       // System.out.println("Checking Name"+name);
        accountNumber = "1"+accountNumber;

        debitCardNumber = (int) (Math.random()*Math.pow(10,12));
        debitCardPin = (int) (Math.random()*Math.pow(10,4));

        setRate();
    }

    @Override
    void setRate() {
        interestRate = getBaseRate()*.15;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Account Type: Checking");
        System.out.println("Debit Card Number: "+debitCardNumber+
        "\n Debit Card Pin: "+debitCardPin);

    }




    //proper method
}
