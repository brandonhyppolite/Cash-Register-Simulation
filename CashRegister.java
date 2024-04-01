/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q4;

import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 *
 * @author brandonhyppolite
 */
public class CashRegister {
    
    /**
     * Construct the CashRegister object
     * @param bInventory interaction with the inventory
     */
    public CashRegister(Inventory bInventory){
        cart = new ArrayList<>();
        aInventory = bInventory;
    }
    
    /**
     * store and display each product in a cart array
     * @param upc use the upc code to get the product info.
     */
    public void getAndDisplayProduct(int upc){
        Product product;
        product = aInventory.getproductDetails(upc);
        cart.add(product);
        System.out.println(product);
    }
    
    /**
     * calculate and display the total cost of all the products added up.
     */
    public void displaytotal(){
        for(Product product: cart){
            totalCost += product.price;
        }
        System.out.println("The total is: $" + df.format(totalCost));
    }
    
    /**
     * display the list of products bought and the total of it all.
     */
    public void displayReceipt(){
        System.out.println("Receipt");
        for(Product product: cart){
            System.out.println(product);
        }
        System.out.println("Total: $" + df.format(totalCost));
        }
    
    ArrayList<Product> cart;
    Inventory aInventory;
    double totalCost;
    DecimalFormat df = new DecimalFormat("0.00");
}
