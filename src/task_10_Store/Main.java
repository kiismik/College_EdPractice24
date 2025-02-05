package task_10_Store;

public class Main {
    public static void main(String[] args) {
        IInventoryDriverAdapter warehouseAdapter = new WarehouseInventoryAdapter();
        InventoryAccess inventoryAccess = new InventoryAccess(warehouseAdapter);
        InventoryAccessProxy proxy = new InventoryAccessProxy(inventoryAccess);
        StoreController controller = new StoreController(proxy);

        proxy.connect("http://warehouse.example.com");
        controller.addProduct();
        proxy.getProductDetails(new int[]{1, 2, 3});
        controller.updateProductDetails();
        proxy.confirmChanges();
        proxy.disconnect();
    }
}