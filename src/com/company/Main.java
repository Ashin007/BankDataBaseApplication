package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String file = "C:\\Users\\Ashin\\Desktop\\NewBankAccounts.csv";


//        Checking checking1 = new Checking("Ashin","123456789",1500);
//       Savings savings1 = new Savings("Vijayan","123456789",2500);
//
//        checking1.showInfo();
//        savings1.showInfo();
//
//        checking1.deposit(5000);
//        checking1.withdraw(200);

        List<Account>accountData = new LinkedList<>();


        List<String[]> newCustomer = utilities.ReadFile.read(file);
        for (String[] accountHolder:newCustomer
             ) {
            String name = accountHolder[0];
            String sSn = accountHolder[1];
            String accountType = accountHolder[2];
            double deposit = Double.parseDouble(accountHolder[3]);

            /*System.out.println("Account Holder Name: "+name+
            "\nSSN Number: "+sSn+
            "\nAccount Type: "+accountType+
            "\nDeposit Amount: "+deposit);

           */

            if(accountType.equals("Savings")){
                
                accountData.add(new Savings(name,sSn,deposit));

            }
            else if(accountType.equals("Checking")){

                accountData.add(new Checking(name,sSn,deposit));
            }
            else{
                System.out.println("Error Reading File");
            }
        }

        for ( Account account:accountData
             ) {
             account.showInfo();
            
        }
    }
}
