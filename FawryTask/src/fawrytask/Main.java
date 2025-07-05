/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawrytask;

/**
 *
 * @author Mahmoud Waleed
 */
public class Main {
    public static void checkout(Customer customer, Cart cart){
        if(cart.getProducts().isEmpty()){
            System.out.println("Invalid Process: Cart is Empty");
        }
        else if(cart.getTotalPrices()> customer.getBalance()){
            System.out.println("Invalid Process: Insufficient balance");
        }
        else if(!cart.isAvailable()){
            System.out.println("Invalid Process: Cart contains products that are expired");
        }
        else{
            ShippingService.shipItems(cart.getShippableItems());
            customer.setBalance(customer.getBalance()-cart.getTotalPrices()-cart.getShippingPrice());
            System.out.println("** Checkout receipt **");
            for (int i = 0; i<cart.getProducts().size(); i++) {
            System.out.printf("%-1s %-10s %8.0f%n",cart.getQuantities().get(i) +"x ",cart.getProducts().get(i).getName(),cart.getProducts().get(i).getPrice());      
        }
            System.out.println("----------------------");
            System.out.println("Subtotal         "+cart.getTotalPrices());
            System.out.println("Shipping         "+cart.getShippingPrice());
            System.out.println("Amount           "+(cart.getTotalPrices()+cart.getShippingPrice())); 
            System.out.println("Current Balance  "+(customer.getBalance())); 
        }
    }
        public static void main(String[] args) {
           Customer customer = new Customer(5000);
           ShippableProduct cheese = new ShippableProduct("cheese",250,1000,false,15,400);
           ShippableProduct biscuits = new ShippableProduct("biscuits",750,900,false,15,100);
           Product card = new Product("card",950,200,false);
           Cart cart = new Cart();
           cart.add(cheese, 2);
           cart.add(biscuits, 3);
           cart.add(card, 1);
           checkout(customer, cart);
        
    }

}
