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
public class Ebook extends Book{
    private final String fileType;

    public Ebook(String ISBN, String title, double price, LocalDate publishDate, String fileType) {
        super(ISBN, title, price, publishDate);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    @Override
    public boolean forSale() {
        return true;
    }
    
    @Override
    public void sendToCustomer(String email, String address) {
        MailService.sendBook(this, email);
}
}
