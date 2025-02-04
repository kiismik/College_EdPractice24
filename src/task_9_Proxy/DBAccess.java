package task_9_Proxy;

class DBAccess implements IDatabaseAccessProxy {
    private String _url;
    private boolean _isOpen;

    @Override
    public String[] executeQuery(int[] lineNumbers) {
        System.out.println("Executing query with result in DB.");
        return new String[]{"Result1", "Result2"};
    }

    @Override
    public void executeQueryNoResult(int[] lineNumbers) {
        System.out.println("Executing query without result in DB.");
    }

    @Override
    public boolean checkDatabaseStatus() {
        System.out.println("Checking database status.");
        return _isOpen;
    }

    @Override
    public void open(String url) {
        _url = url;
        _isOpen = true;
        System.out.println("Database opened: " + url);
    }

    @Override
    public void close() {
        _isOpen = false;
        System.out.println("Database closed.");
    }

    @Override
    public void commit() {
        System.out.println("Database commit.");
    }

    @Override
    public void rollback() {
        System.out.println("Database rollback.");
    }
}
