package task_10_Store;

class SupplierInventoryAdapter implements IInventoryDriverAdapter {
    private String _authToken;
    private long _tokenExpiry;

    @Override
    public String[] getProductDetails(int[] productIds) {
        System.out.println("Fetching product details from supplier inventory.");
        return new String[]{"Supplier Product1", "Supplier Product2"};
    }

    @Override
    public void updateStock(int[] productIds) {
        System.out.println("Updating stock in supplier inventory.");
    }

    @Override
    public boolean checkInventoryStatus() {
        System.out.println("Checking supplier inventory status.");
        return true;
    }

    @Override
    public void connect(String url) {
        _authToken = "SupplierAuthToken";
        _tokenExpiry = System.currentTimeMillis() + 3600000;
        System.out.println("Connecting to supplier inventory with token.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from supplier inventory.");
    }

    @Override
    public void confirmChanges() {
        System.out.println("Confirming changes in supplier inventory.");
    }

    @Override
    public void revertChanges(String reason) {
        System.out.println("Reverting changes in supplier inventory: " + reason);
    }
}
