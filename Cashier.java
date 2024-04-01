/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q4;

import java.util.Scanner;

/**
 *
 * @author brandonhyppolite
 */
public class Cashier {
    
    /**
     * Construct Cashier object
     * @param aUpcScanner the UPCScanner the cashier uses to scan the products
     * @param acustomer the buyer that interacts with the cashier
     * @param acashRegister the register that the cashier interacts with
     * @param aInput used for getting input
     */
    public Cashier(UPCScanner aUpcScanner, Buyer acustomer, CashRegister acashRegister, Scanner aInput){
        upcCode = aUpcScanner;
        customer = acustomer;
        cashRegister = acashRegister;
        sc = aInput;
    }
    
    /**
     * Scan the upc code
     * @param upc the upc code of the product
     */
    public void scanProduct(int upc){
        upcCode.readUPC(upc);
    }
    
    /**
     * Simulate the payment process
     */
    public void pay(){
        paid = true;
    }
    
    /**
     * collects the cash from the buyer
     */
    public void collectCash(){
        double cashAmount = customer.giveCash(cashRegister.totalCost);
        if(cashAmount == cashRegister.totalCost){ 
            cash = cashAmount;
        }
        else{
            System.out.println("Buyer doesn't have enough money");
            System.exit(1);
        }
        pay();
    }
    
    /**
     * A loop to enter upc and scan items, until the pay button is pressed.
     */
    public void checkout(){
        while(!paid){
            int signal = 0;
            System.out.println("Enter the UPC: ");
            int upc = sc.nextInt();
            scanProduct(upc);
            
            do{
                System.out.println("Enter 0 if you want to pay or 1 if you want to scan more items: ");
                signal = sc.nextInt();
                if (signal == 0){
                    System.out.println("");
                    cashRegister.displaytotal();
                    System.out.println("");
                    System.out.println("Checking out...");
                    cashRegister.displayReceipt();
                    collectCash();
                } else if(signal == 1){
                    break;
                } else{
                    System.out.println("Invalid option, try again.");
                } 
            } while (signal != 0);
            

        }
    }
    
    UPCScanner upcCode;
    double cash;
    CashRegister cashRegister;
    Buyer customer;
    int upc;
    private Scanner sc;
    boolean paid;
}