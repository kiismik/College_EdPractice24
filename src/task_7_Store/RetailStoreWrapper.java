package task_7_Store;

public class RetailStoreWrapper extends AbstractWrapper {
    private final String storeName;

    public RetailStoreWrapper(IProductWrapper wrappee, String storeName) {
        super(wrappee);
        this.storeName = storeName;
    }

    @Override
    public void addProduct(StoreProduct product) {
        System.out.println("Adding product to retail store: " + storeName);
        super.addProduct(product);
    }
}
