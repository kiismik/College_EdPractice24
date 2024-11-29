package task_3_Store;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println(product.getName() + " removed from cart.");
    }

    public void checkout() {
        System.out.println("Checkout completed. Products in cart:");
        for (Product product : products) {
            System.out.println("- " + product);
        }
        products.clear();
    }
}

