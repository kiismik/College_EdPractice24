package task_10_Adapter;

class DBAccess implements IDatabaseAccessProxy {
    private String _url;
    private boolean _isOpen;
    private IDatabaseDriverAdapter _impl;

    public DBAccess(IDatabaseDriverAdapter impl) {
        this._impl = impl;
    }

    public void setDriverAdapter(IDatabaseDriverAdapter impl) {
        this._impl = impl;
    }

    @Override
    public String[] executeQuery(int[] lineNumbers) {
        return _impl.executeQuery(lineNumbers);
    }

    @Override
    public void executeQueryNoResult(int[] lineNumbers) {
        _impl.executeQueryNoResult(lineNumbers);
    }

    @Override
    public boolean checkDatabaseStatus() {
        return _impl.checkDatabaseStatus();
    }

    @Override
    public void open(String url) {
        _url = url;
        _isOpen = true;
        _impl.open(url);
    }

    @Override
    public void close() {
        _isOpen = false;
        _impl.close();
    }

    @Override
    public void commit() {
        _impl.commit();
    }

    @Override
    public void rollback(String type) {
        _impl.rollback(type);
    }
}
