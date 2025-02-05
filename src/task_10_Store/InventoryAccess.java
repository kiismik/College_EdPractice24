package task_10_Store;

class InventoryAccess implements IInventoryAccessProxy {
    private String _url;
    private boolean _isConnected;
    private IInventoryDriverAdapter _adapter;

    public InventoryAccess(IInventoryDriverAdapter adapter) {
        this._adapter = adapter;
    }

    public void setAdapter(IInventoryDriverAdapter adapter) {
        this._adapter = adapter;
    }

    @Override
    public String[] getProductDetails(int[] productIds) {
        return _adapter.getProductDetails(productIds);
    }

    @Override
    public void updateStock(int[] productIds) {
        _adapter.updateStock(productIds);
    }

    @Override
    public boolean checkInventoryStatus() {
        return _adapter.checkInventoryStatus();
    }

    @Override
    public void connect(String url) {
        _url = url;
        _isConnected = true;
        _adapter.connect(url);
    }

    @Override
    public void disconnect() {
        _isConnected = false;
        _adapter.disconnect();
    }

    @Override
    public void confirmChanges() {
        _adapter.confirmChanges();
    }

    @Override
    public void revertChanges(String reason) {
        _adapter.revertChanges(reason);
    }
}