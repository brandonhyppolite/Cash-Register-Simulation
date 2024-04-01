/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q4;


/**
 *
 * @author brandonhyppolite
 */
public class UPCScanner {
    
    /**
     * Construct the UPCScanner object
     * @param aCashRegister interaction with the cash register class
     */
    public UPCScanner(CashRegister aCashRegister){
        register = aCashRegister;
    }
    /**
     * read the upc code
     * @param productUPC the upc code of the product 
     */
    public void readUPC(int productUPC){
        upc = productUPC;
        sendUPC();
    }
    
    /**
     * send the upc code to the cash register
     */
    public void sendUPC(){
        register.getAndDisplayProduct(upc);
    }
    
    CashRegister register;
    int upc;
}
