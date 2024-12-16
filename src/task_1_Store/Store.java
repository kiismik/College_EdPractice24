package task_1_Store;

import java.util.ArrayList;
public class Store {
    private static Store instance;
    private ArrayList<Product> products;
    private Store() {
        this.products = new ArrayList<>();
    }
    public static Store getInstance() {
        if (instance == null) {
            synchronized (Store.class) {
                if (instance == null) {
                    instance = new Store();
                }
            }
        }
        return instance;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
    public void describeAllProducts() {
        if (products.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            for (Product product : products) {
                System.out.println(product.describe());
            }
        }
    }
}
