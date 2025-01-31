package task_7_Store;

public class StoreProduct {
    private final ProductCategory category;
    private final String name;
    private double price;

    public StoreProduct(ProductCategory category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
