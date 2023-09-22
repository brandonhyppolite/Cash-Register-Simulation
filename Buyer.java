/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q4;

/**
 *
 * @author brandonhyppolite
 */
public class Buyer {
    public Buyer(double totalCash){
        money = totalCash;
    }
    
    /**
     * give cash to cashier to be used to pay
     * @param total the total amount of money
     * @return 
     */
    public double giveCash(double total){
        if(money - total > 0){
            money = money - total;
            return total;
        }
        else{
            return 0;
        }
    }
    
    Cashier acashier;
    double money;
}
