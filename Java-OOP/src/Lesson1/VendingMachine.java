package Lesson1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    protected List<Product> products;

    public VendingMachine() {

        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {

        this.products = products;
    }

    public void addProduct(Product product) {

        this.products.add(product);
    }

    public void addProducts(List<Product> products) {

        this.products.addAll(products);
    }

    public Product getProduct(String productName) {

//        products.stream().filter(product ->
//                product.getName().equals(productName))
//                .findFirst().orElse(null);

        for (Product product : products) {
            if (product.getName().equals(productName)) {
                products.remove(product);
                return product;
            }
        }

        System.out.println("Product not found" + productName);
        return null;
    }

    public List<Product> getProducts() {

        return products;
    }
}
