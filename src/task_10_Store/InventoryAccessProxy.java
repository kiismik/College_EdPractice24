package task_10_Store;

import java.time.LocalDateTime;

class InventoryAccessProxy implements IInventoryAccessProxy {
    private InventoryAccess _inventoryAccess;

    public InventoryAccessProxy(InventoryAccess inventoryAccess) {
        this._inventoryAccess = inventoryAccess;
    }

    @Override
    public String[] getProductDetails(int[] productIds) {
        var startTime = LocalDateTime.now();
        String[] result = _inventoryAccess.getProductDetails(productIds);
        var endTime = LocalDateTime.now();
        System.out.println("Time elapsed: " + (endTime.getNano() - startTime.getNano()) + " ns");
        return result;
    }

    @Override
    public void updateStock(int[] productIds) {
        var startTime = LocalDateTime.now();
        _inventoryAccess.updateStock(productIds);
        var endTime = LocalDateTime.now();
        System.out.println("Time elapsed: " + (endTime.getNano() - startTime.getNano()) + " ns");
    }

    @Override
    public boolean checkInventoryStatus() {
        return _inventoryAccess.checkInventoryStatus();
    }

    @Override
    public void connect(String url) {
        _inventoryAccess.connect(url);
    }

    @Override
    public void disconnect() {
        _inventoryAccess.disconnect();
    }

    @Override
    public void confirmChanges() {
        _inventoryAccess.confirmChanges();
    }

    @Override
    public void revertChanges(String reason) {
        _inventoryAccess.revertChanges(reason);
    }
}
