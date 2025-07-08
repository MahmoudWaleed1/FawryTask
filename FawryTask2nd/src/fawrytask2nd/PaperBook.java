/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawrytask2nd;

import java.time.LocalDate;

/**
 *
 * @author Mahmoud Waleed
 */
public class PaperBook extends Book{
    double stockQuantity;
    public PaperBook(String ISBN, String title, double price, LocalDate publishDate, double stockQuantity) {
        super(ISBN, title, price, publishDate);
        this.stockQuantity = stockQuantity;
    }

    public double getStockQuantity() {
        return stockQuantity;
    }

    @Override
    public boolean forSale() {
        return true;
    }

    public void setStockQuantity(double quantity) {
        if(quantity>stockQuantity){
            System.out.println("Error: not enough stock");
        }
        else{
        this.stockQuantity -= quantity;
        }
    }
    
    @Override
    public void sendToCustomer(String email, String address) {
        ShippingService.sendBook(this, address);
}
    
    
}
