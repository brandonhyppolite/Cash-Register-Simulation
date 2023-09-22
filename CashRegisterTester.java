/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q4;

import java.util.Scanner;

/**
 *This program tests the cash register system
 * The hardcoded item upc codes are 101, 102, 103, 104, and 105
 */
public class CashRegisterTester {
    
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        CashRegister register = new CashRegister(inventory);
        UPCScanner upcScanner = new UPCScanner(register);
        Scanner sc = new Scanner(System.in);
        Buyer customer = new Buyer(MoneyAmount);
        Cashier cashier = new Cashier(upcScanner, customer, register, sc );
        cashier.checkout();
    }
    
    private static final double MoneyAmount = 100;
}
