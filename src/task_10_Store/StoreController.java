package task_10_Store;

class StoreController {
    private IInventoryAccessProxy inventory;

    public StoreController(IInventoryAccessProxy inventory) {
        this.inventory = inventory;
    }

    public void addProduct() {
        System.out.println("Adding product to inventory.");
    }

    public void removeProduct() {
        System.out.println("Removing product from inventory.");
    }

    public void updateProductDetails() {
        System.out.println("Updating product details in inventory.");
    }
}
