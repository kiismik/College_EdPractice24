package task_7_Store;

public class DiscountWrapper extends AbstractWrapper {
    private final double discountPercentage;

    public DiscountWrapper(IProductWrapper wrappee, double discountPercentage) {
        super(wrappee);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public void addProduct(StoreProduct product) {
        product.setPrice(product.getPrice() * (1 - discountPercentage / 100));
        System.out.println("Applied discount of " + discountPercentage + "% to " + product.getName());
        super.addProduct(product);
    }
}
