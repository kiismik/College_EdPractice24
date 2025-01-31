package task_7_Store;

public class OnlineStoreWrapper extends AbstractWrapper {
    private final String storePlatform;

    public OnlineStoreWrapper(IProductWrapper wrappee, String storePlatform) {
        super(wrappee);
        this.storePlatform = storePlatform;
    }

    @Override
    public void addProduct(StoreProduct product) {
        System.out.println("Listing product on online platform: " + storePlatform);
        super.addProduct(product);
    }
}
