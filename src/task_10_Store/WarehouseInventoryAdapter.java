package task_10_Store;

class WarehouseInventoryAdapter implements IInventoryDriverAdapter {
    private String _url;

    @Override
    public String[] getProductDetails(int[] productIds) {
        System.out.println("Fetching product details from warehouse inventory.");
        return new String[]{"Warehouse Product1", "Warehouse Product2"};
    }

    @Override
    public void updateStock(int[] productIds) {
        System.out.println("Updating stock in warehouse inventory.");
    }

    @Override
    public boolean checkInventoryStatus() {
        System.out.println("Checking warehouse inventory status.");
        return true;
    }

    @Override
    public void connect(String url) {
        _url = url;
        System.out.println("Connecting to warehouse inventory: " + url);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from warehouse inventory.");
    }

    @Override
    public void confirmChanges() {
        System.out.println("Confirming changes in warehouse inventory.");
    }

    @Override
    public void revertChanges(String reason) {
        System.out.println("Reverting changes in warehouse inventory: " + reason);
    }
}
