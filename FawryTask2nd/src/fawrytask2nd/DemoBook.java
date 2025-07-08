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
public class DemoBook extends Book{

    public DemoBook(String ISBN, String title, double price, LocalDate publishDate) {
        super(ISBN, title, price, publishDate);
    }

    @Override
    public boolean forSale() {
        return false;
    }
    @Override
    public void sendToCustomer(String email, String address) {
        System.out.println("Unreachable code");
}
    
}
