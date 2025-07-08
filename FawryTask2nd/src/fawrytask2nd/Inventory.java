/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawrytask2nd;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mahmoud Waleed
 */
public class Inventory {
    private ArrayList<Book> books;
    private ArrayList<Book> ownedBooks;

    public Inventory() {
        books = new ArrayList<>();
        ownedBooks = new ArrayList<>();
    }
    public void addBook(Book book){
        if(book.forSale()){
            boolean found = false;
            for(Book b: books){
                if(b.getISBN().equals(book.getISBN())){
                    found = true;
                    System.out.println("Can't add book more than once, but you can purchace the quantity you want");
                }
            }
            if(found == false){
            books.add(book);
            System.out.println("Book "+ book.getTitle()+ " added successfully" );
            }
        }
        else{
            System.out.println("Error: Book is just a Demo can't be added");
        }
    }
    
    public void removeBook(Book book){
        boolean found = false;
        for(Book b: books){
            if(b.getISBN().equals(book.getISBN())){
                books.remove(b);
                found = true;
                System.out.println("Book " + book.getTitle() + " removed successfully");
            }
        }
        if(found==false)
        System.out.println("Book is not in the inventory");
}
    
    public void removeOutdatedBooks() {
        LocalDate today = LocalDate.now();
        Iterator<Book> iterator = ownedBooks.iterator(); 

        while (iterator.hasNext()) {
            Book b = iterator.next();
            LocalDate bookDate = b.getPublishDate();
            Period period = Period.between(bookDate, today);
        
        if (period.getYears() > 5) {
            iterator.remove(); 
        }
    }
}
    
    public double buyBook(String ISBN, int quantity, String email, String address){
        for(Book b: books){
            if(b.getISBN().equals(ISBN)){
                double price = b.getPrice()*quantity;
                if(b instanceof PaperBook){
                    if(address==null){
                         throw new IllegalArgumentException("Provide a valid address");
                    }
                    else{
                    b.sendToCustomer(email, address);
                    ((PaperBook) b).setStockQuantity(quantity);
                    ownedBooks.add(b);
                    books.remove(b);
                }
                }
                else{
                    if(email== null){
                         throw new IllegalArgumentException("Provide a valid email");
                    }
                    else{
                        
                    b.sendToCustomer(email, address);
                    ownedBooks.add(b);
                    books.remove(b);
                    }
                }
                return price;
                
            }
        }
        throw new IllegalArgumentException("Book not found");
    }
    
    public void displayInventoryBooks(){
        for(Book b: books){
            System.out.println(b.getTitle());
        }
    }
        public void displayOwnedBooks(){
        for(Book b: ownedBooks){
            System.out.println(b.getTitle());
        }
    }
}
