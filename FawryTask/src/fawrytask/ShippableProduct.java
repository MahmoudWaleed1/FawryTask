/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawrytask;

/**
 *
 * @author Mahmoud Waleed
 */
public class ShippableProduct extends Product implements ShippingInterface{
    private final double shippingPrice;
    private final double weight;
    
    public ShippableProduct(String name, double price, int quantity, boolean canExpire, double shippingPrice, double weight) {
        super(name, price, quantity, canExpire);
        this.shippingPrice = shippingPrice;
        this.weight = weight;
    }

    public double getShippingPrice() { // Assuming its independant of quantity
        return shippingPrice;
    }

    @Override
    public double getWeight() {
        return weight;
    }
    
}
