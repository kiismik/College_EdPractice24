package task_5_Store;

public class Product extends StoreComponent {
    private String productName;
    private String productImagePath;

    public Product(String name, String productName, String productImagePath) {
        this.name = name;
        this.productName = productName;
        this.productImagePath = productImagePath;
    }

    @Override
    public void display() {
        System.out.println("Displaying Product: " + name + "; Name: \"" + productName + "\"; Image: \"" + productImagePath + "\"");
    }

    @Override
    public void addComponent(StoreComponent component) {
        throw new UnsupportedOperationException("Cannot add a component to a Product.");
    }

    @Override
    public void removeComponent(String name) {
        throw new UnsupportedOperationException("Cannot remove a component from a Product.");
    }
}
