/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q4;

import java.text.DecimalFormat;

/**
 *
 * @author brandonhyppolite
 */
public class Product {
    
    /**
     * Construct the Product object
     * @param productUPC upc code of the product
     * @param pname name of the product
     * @param unitPrice price of the product
     */
    public Product(int productUPC, String pname, double unitPrice){
        upc = productUPC;
        name = pname;
        price = unitPrice;
        
    }
    
    /**
     * create a string that prints out the name, upc code, and price of the product
     * @return 
     */
    public String toString(){
        return ("Product: " + name + ", UPC: " + upc + ", Price: " + df.format(price));
    }
    
    
    String name;
    double price;
    int upc;
    DecimalFormat df = new DecimalFormat("0.00");
}
