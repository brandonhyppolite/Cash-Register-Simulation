/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q4;

import java.util.ArrayList;

/**
 *
 * @author brandonhyppolite
 */
public class Inventory {
    
    /**
     * Construct the Inventory object
     */
    Inventory(){
        productInventory = new ArrayList<>();
        addToInventory();
    }
    
    /**
     * Creates each product using the product class and stores it
     * into an array list.
     */
    public void addToInventory(){
        Product snickerBar = new Product(101, "Snickers Bar", 1);
        Product chips = new Product(102, "Doritos", 1.25);
        Product cookie = new Product(103, "Chocolate Chip Cookie", 3.59);
        Product drink = new Product(104, "Pineapple Mango Smoothie", 2.49);
        Product candy = new Product(105, "Trolli", 4.69);
        productInventory.add(snickerBar);
        productInventory.add(chips);
        productInventory.add(cookie);
        productInventory.add(drink);
        productInventory.add(candy);
    }
    
    /**
     * Will get the product details.
     * @param upc the upc code of the product
     * @return the product associated with the upc code
     */
    public Product getproductDetails(int upc){
        for(Product x: productInventory){
            if (x.upc == upc)
                return x;
        }
        System.out.println("This product doesn't exist");
        return null;
    }
    
    public ArrayList<Product> productInventory;
}
