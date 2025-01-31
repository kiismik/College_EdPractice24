package task_8_Store;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Ukraine", "Kyiv region", "Kyiv", "Street 1", "01001");
        Staff staff1 = new Staff("Alex", LocalDateTime.now(), address1);

        Address address2 = new Address("Ukraine", "Lviv region", "Lviv", "Street 2", "79000");
        StoreManager manager1 = new StoreManager("Olga", LocalDateTime.now(), address2, "Electronics", LocalDateTime.now());

        ElectronicProduct product1 = new ElectronicProduct("Smartphone A", manager1, 20000, true, ProductCategory.SMARTPHONES);
        InternalTool tool1 = new InternalTool("Inventory System", "Warehouse Manager");

        ProductStorage storage = new ProductStorage();
        storage.addProduct(staff1);
        storage.addProduct(manager1);
        storage.addProduct(product1);
        storage.addProduct(tool1);

        storage.save("db");
    }
}
