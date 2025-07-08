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
public abstract class Book {
    private String ISBN;
    private String title;
    private double price;
    private LocalDate publishDate;

    public Book(String ISBN, String title, double price, LocalDate publishDate) {
        this.ISBN = ISBN;
        this.title = title;
        this.price = price;
        this.publishDate = publishDate;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }
    public abstract boolean forSale();
    
    public abstract void sendToCustomer(String email, String address);

}
