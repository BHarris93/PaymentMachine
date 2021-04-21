/*
Developer: Brian Harris
Class: CMIS 242
Date: 04/21/2021
*/

package com.company;

import java.util.Scanner;

public class RunPaymentMachine {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        PaymentMachine yourPayment = null; //creates a null variable of PaymentMachine
        int choice; //variable for users choice in the if statement below

        //requests input from the user
        System.out.println("Enter (1) for credit or (2) for debit: ");
        choice = s.nextInt();

        //takes user's input and carries out the proper action
        if(choice == 1){
            yourPayment = new Credit();
        } else if(choice == 2) {
            yourPayment = new Debit();
        }

        //dynamically calls the pay() method on whichever instance of PaymentMachine was created
        yourPayment.pay();
    }
}
