package task_8_Store;

import java.util.ArrayList;
import java.util.List;

class ProductStorage {
    private List<Product> products = new ArrayList<>();
    private StoreAbstractVisitor serializer;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void save() {
        save("json");
    }

    public void save(String format) {
        if (format.equals("db")) {
            serializer = new StoreDatabaseVisitor();
        } else if (format.equals("json")) {
            serializer = new StoreJsonVisitor();
        }

        for (Product product : products) {
            System.out.println(product.accept(serializer));
        }
    }
}
