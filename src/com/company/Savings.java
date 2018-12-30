package com.company;

public class Savings extends Account {

    //properties specific to savings

    private int savingsDepositID;
    private int savingsDepositKey;

    Savings(String name, String sSn, double deposit) {
        super(name,sSn,deposit  );

        // System.out.println("Savings Account");
        //System.out.println("Savings Name"+name);

        accountNumber = "2"+accountNumber;

        savingsDepositID = (int) (Math.random()*Math.pow(10,5));
        savingsDepositKey = (int) (Math.random()*Math.pow(10,4));

        setRate();
    }

    @Override
    void setRate() {
        interestRate = getBaseRate()*.25;
    }

    public void showInfo(){
        super.showInfo();

        System.out.println("Account Type: Savings");
        System.out.println("Savings Deposit ID: "+savingsDepositID+
                "\n Savings Deposit Key: "+savingsDepositKey);

    }


}
