/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawrytask;

/**
 *
 * @author Mahmoud Waleed
 */
import java.util.Map;
public class ShippingService {
   public static void shipItems(Map<ShippableProduct, Integer> products) {
        System.out.println("** Shipment notice **");
        double sum=0;
        for (Map.Entry<ShippableProduct, Integer> item: products.entrySet()) {
            sum += (item.getKey().getWeight()*item.getValue());
            System.out.printf("%-3s %-13s %8.2f grams%n",item.getValue() +"x ",item.getKey().getName(), (item.getKey().getWeight()*item.getValue()));
        }
        if(sum>1000){
            sum = sum/1000;
            System.out.println("Total package weight "+ sum + " kg");
        }
        else{
            System.out.println("Total package weight "+ sum + " grams");
        }
    }
}
