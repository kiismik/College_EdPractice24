package task_9_Store;

import java.time.LocalDateTime;

class StoreAccessProxy implements IStoreAccessProxy {
    private StoreAccess _storeHandle;

    public StoreAccessProxy(StoreAccess storeHandle) {
        this._storeHandle = storeHandle;
    }

    @Override
    public String[] executeQuery(int[] productIDs) {
        var startTime = LocalDateTime.now();
        String[] result = _storeHandle.executeQuery(productIDs);
        var endTime = LocalDateTime.now();
        System.out.println("Time elapsed: " + (endTime.getNano() - startTime.getNano()) + " ns");
        return result;
    }

    @Override
    public void executeQueryNoResult(int[] productIDs) {
        var startTime = LocalDateTime.now();
        _storeHandle.executeQueryNoResult(productIDs);
        var endTime = LocalDateTime.now();
        System.out.println("Time elapsed: " + (endTime.getNano() - startTime.getNano()) + " ns");
    }

    @Override
    public boolean checkStoreStatus() {
        return _storeHandle.checkStoreStatus();
    }

    @Override
    public void open(String url) {
        _storeHandle.open(url);
    }

    @Override
    public void close() {
        _storeHandle.close();
    }

    @Override
    public void commit() {
        _storeHandle.commit();
    }

    @Override
    public void rollback() {
        _storeHandle.rollback();
    }
}
