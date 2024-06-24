package Lesson1.HW_impl;

import Lesson1.Product;
import Lesson1.VendingMachine;

import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {

    public HotDrinkVendingMachine() {
        super();
    }

    public HotDrinkVendingMachine(List<Product> products) {
        super(products);
    }

    public HotDrink getProduct(String productName, float volume, int temperature) {

        for (Product product : products) {
            if (product.getName().equals(productName) && product instanceof HotDrink) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getTemperature() == temperature && hotDrink.getVolume() == volume) {
                    products.remove(product);
                    return hotDrink;
                }
            }
        }

        System.out.println("Hotdrink not found: " + productName + " with temperature " + temperature);
        return null;
    }
}
