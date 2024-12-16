package task_1_Store;

public class Main {
    public static void main(String[] args) {
        Store store = Store.getInstance();
        Product product1 = new Product("Laptop", "Electronics", 50500.99, (short) 2022, "Apple", 10, 4.8, "High-performance laptop with M1 chip.");
        Product product2 = new Product("Chair", "Furniture", 2400, (short) 2021, "IKEA", 50, 4.3, "Ergonomic chair for home and office.");
        Product product3 = new Product("Notebook", "Stationery", 2.50, (short) 2023, "Oxford", 200, 4.9, "100-page ruled notebook for daily use.");
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        System.out.println("All products in the store:");
        store.describeAllProducts();
        store.removeProduct(product2);
        System.out.println("\nAfter removing a product:");
        store.describeAllProducts();
    }
}
