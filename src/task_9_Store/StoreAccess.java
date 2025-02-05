package task_9_Store;

class StoreAccess implements IStoreAccessProxy {
    private String _url;
    private boolean _isOpen;

    @Override
    public String[] executeQuery(int[] productIDs) {
        System.out.println("Querying product information in store database.");
        return new String[]{"Product1 Info", "Product2 Info"};
    }

    @Override
    public void executeQueryNoResult(int[] productIDs) {
        System.out.println("Executing product-related operation in store database.");
    }

    @Override
    public boolean checkStoreStatus() {
        System.out.println("Checking store database status.");
        return _isOpen;
    }

    @Override
    public void open(String url) {
        _url = url;
        _isOpen = true;
        System.out.println("Store database opened: " + url);
    }

    @Override
    public void close() {
        _isOpen = false;
        System.out.println("Store database closed.");
    }

    @Override
    public void commit() {
        System.out.println("Changes committed to store database.");
    }

    @Override
    public void rollback() {
        System.out.println("Reverted changes in store database.");
    }
}
