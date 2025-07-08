/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawrytask2nd;

/**
 *
 * @author Mahmoud Waleed
 */
public class MailService {
    public static void sendBook(Book book,String email){
        System.out.println("Sending the book "+book.getTitle()+" to "+email);
    }
}
