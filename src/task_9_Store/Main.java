package task_9_Store;

public class Main {
    public static void main(String[] args) {
        StoreAccess realStore = new StoreAccess();
        StoreAccessProxy proxy = new StoreAccessProxy(realStore);
        StoreController controller = new StoreController(proxy);

        proxy.open("jdbc://localhost:5432/storeDB");
        controller.addCustomer();
        proxy.executeQuery(new int[]{101, 202, 303});
        controller.addProduct();
        proxy.commit();
        proxy.close();
    }
}