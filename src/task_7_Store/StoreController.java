package task_7_Store;

import java.util.ArrayList;
import java.util.List;

public class StoreController {
    private final List<StoreProduct> productList = new ArrayList<>();
    private final IProductWrapper wrapper;

    public StoreController(IProductWrapper wrapper) {
        this.wrapper = wrapper;
    }

    public void addProductToStore(StoreProduct product) {
        productList.add(product);
        wrapper.addProduct(product);
    }
}
