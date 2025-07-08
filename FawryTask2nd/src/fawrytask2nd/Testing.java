/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fawrytask2nd;

import java.time.LocalDate;

/**
 *
 * @author Mahmoud Waleed
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("#############Constructing Objects#############");
        PaperBook paper1 = new PaperBook("P123", "PaperBook1", 1200, LocalDate.of(2015,02,17), 200);
        PaperBook paper2 = new PaperBook("P1234", "PaperBook2", 5200, LocalDate.of(2025,02,17), 200);
        PaperBook paper3 = new PaperBook("P12345", "PaperBook3", 5200, LocalDate.of(2025,02,17), 200);
        Ebook e = new Ebook("E123", "Ebokkkk", 500, LocalDate.of(2022,02,17), "Text");
        DemoBook d = new DemoBook("D1234", "DemoBook", 0, LocalDate.of(1999,05,20));
        Inventory inv = new Inventory();
        System.out.println(" ");
        System.out.println("#######Adding to Inventory#########");
        inv.addBook(paper1);
        inv.addBook(paper2);
        inv.addBook(paper3);
        inv.addBook(e);
        inv.addBook(d);
        System.out.println("");
        System.out.println("##########Removing a book from inventory#############");
        inv.removeBook(paper3);
        System.out.println("");
        System.out.println("##########Displaying Inventory Books############");
        inv.displayInventoryBooks();
        System.out.println("");
        System.out.println("######### Displaying purchasing prices############");
        double pricePbook1 = inv.buyBook("P123", 3, "haha@me.com", "Nasr city");
        System.out.println(pricePbook1);
        double priceEbook = inv.buyBook("E123", 3, "haha@me.com", "kafr abdo");
        System.out.println(priceEbook);
        System.out.println("");
        System.out.println("########## Showing current Inventory Books############");
        inv.displayInventoryBooks();
        System.out.println("");
        System.out.println("########## Showing current Owned Books############");
        inv.displayOwnedBooks();
        System.out.println("");
        System.out.println("###########Removing the Outdated Book###########");
        inv.removeOutdatedBooks();
        inv.displayOwnedBooks();    }
    
}
