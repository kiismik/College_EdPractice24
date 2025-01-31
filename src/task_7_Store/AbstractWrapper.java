package task_7_Store;

public abstract class AbstractWrapper implements IProductWrapper {
    protected IProductWrapper wrappee;

    public AbstractWrapper(IProductWrapper wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void addProduct(StoreProduct product) {
        if (wrappee != null) {
            wrappee.addProduct(product);
        }
    }
}
