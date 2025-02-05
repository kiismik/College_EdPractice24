package task_10_Store;

interface IInventoryDriverAdapter {
    String[] getProductDetails(int[] productIds);
    void updateStock(int[] productIds);
    boolean checkInventoryStatus();
    void connect(String url);
    void disconnect();
    void confirmChanges();
    void revertChanges(String reason);
}