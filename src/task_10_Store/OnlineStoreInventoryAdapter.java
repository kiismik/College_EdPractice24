package task_10_Store;

class OnlineStoreInventoryAdapter implements IInventoryDriverAdapter {
    private String _url;

    @Override
    public String[] getProductDetails(int[] productIds) {
        System.out.println("Fetching product details from online store inventory.");
        return new String[]{"Online Store Product1", "Online Store Product2"};
    }

    @Override
    public void updateStock(int[] productIds) {
        System.out.println("Updating stock in online store inventory.");
    }

    @Override
    public boolean checkInventoryStatus() {
        System.out.println("Checking online store inventory status.");
        return true;
    }

    @Override
    public void connect(String url) {
        _url = url;
        System.out.println("Connecting to online store inventory: " + url);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from online store inventory.");
    }

    @Override
    public void confirmChanges() {
        System.out.println("Confirming changes in online store inventory.");
    }

    @Override
    public void revertChanges(String reason) {
        System.out.println("Reverting changes in online store inventory: " + reason);
    }
}