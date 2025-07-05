/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fawrytask;

/**
 *
 * @author Mahmoud Waleed
 */
public class Product {
    private final String name;
    private final double price;
    private int quantity;
    private final boolean canExpire;

    public Product(String name, double price, int quantity, boolean canExpire) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.canExpire = canExpire;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isCanExpire() {
        return canExpire;
    }

}