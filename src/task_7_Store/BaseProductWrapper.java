package task_7_Store;

public class BaseProductWrapper implements IProductWrapper {
    @Override
    public void addProduct(StoreProduct product) {
        System.out.println("Base wrapper: Added product " + product.getName() + " to the store.");
    }
}
