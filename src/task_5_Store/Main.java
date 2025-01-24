package task_5_Store;

public class Main {
    public static void main(String[] args) {

        StoreManager manager = new StoreManager("ElectroStore", 1920, 1080, "Electronics Catalog");

        CategoryLayout layout = new CategoryLayout("LaptopsCategory", 720, 480);
        manager.addComponent(layout);

        layout.addComponent(new Product("Product1", "Gaming Laptop", "/images/gamingLaptop.png"));
        layout.addComponent(new Product("Product2", "Ultrabook", "/images/ultrabook.png"));

        manager.display();

        try {
            Product product = new Product("SpecialOffer", "Discounted Laptop", "/images/discountLaptop.png");
            product.addComponent(new Product("ExtraAccessory", "Mouse", "/images/mouse.png"));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
