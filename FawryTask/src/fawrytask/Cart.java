/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawrytask;

/**
 *
 * @author Mahmoud Waleed
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Cart {
    private final ArrayList<Product> products;
    private final ArrayList<Integer> quantities;

    public Cart() {
        products = new ArrayList<>();
        quantities = new ArrayList<>();
    }
    public void add(Product product, int quantity){
        if(quantity> product.getQuantity()){
            System.out.println("Quantity exceeded max");
        }
        else{
            products.add(product);
            quantities.add(quantity);
            product.setQuantity(product.getQuantity()-quantity);
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Integer> getQuantities() {
        return quantities;
    }
    
    public double getTotalPrices(){
        double sum = 0;
        for(int i = 0; i<products.size(); i++){
            sum+= (products.get(i).getPrice()*quantities.get(i));
        }
        return sum;
    }
    public boolean isAvailable(){
        for(Product p : products){
            if(p.isCanExpire() || p.getQuantity()<=0)
                return false;
        }
        return true;
    }
    public Map<ShippableProduct, Integer> getShippableItems() {
        Map<ShippableProduct, Integer> shippingProducts = new HashMap<>();
        for (int i = 0; i<products.size(); i++) {
            if (products.get(i) instanceof ShippingInterface) {
                shippingProducts.put((ShippableProduct) products.get(i), quantities.get(i));
            }
        }
         return shippingProducts;
         
    }
    public double getShippingPrice(){
        double sum = 0;
        for (Product p : products) {
            if (p instanceof ShippingInterface) {
                ShippableProduct sp = (ShippableProduct) p;
                sum += sp.getShippingPrice();
            }
        }
        return sum;
    }
}
