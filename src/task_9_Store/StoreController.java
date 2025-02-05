package task_9_Store;

class StoreController {
    private IStoreAccessProxy storeHandle;

    public StoreController(IStoreAccessProxy storeHandle) {
        this.storeHandle = storeHandle;
    }

    public void addCustomer() {
        System.out.println("Adding customer to store database.");
    }

    public void removeCustomer() {
        System.out.println("Removing customer from store database.");
    }

    public void modifyProduct() {
        System.out.println("Modifying product in store database.");
    }

    public void addProduct() {
        System.out.println("Adding product to store database.");
    }

    public void removeProduct() {
        System.out.println("Removing product from store database.");
    }
}

