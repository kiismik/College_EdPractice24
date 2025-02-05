package task_10_Adapter;

class MsSQLDatabaseAdapter implements IDatabaseDriverAdapter {
    private String _url;

    @Override
    public String[] executeQuery(int[] lineNumbers) {
        System.out.println("Executing query on MS SQL database.");
        return new String[]{"MS SQL Result1", "MS SQL Result2"};
    }

    @Override
    public void executeQueryNoResult(int[] lineNumbers) {
        System.out.println("Executing query with no result on MS SQL database.");
    }

    @Override
    public boolean checkDatabaseStatus() {
        System.out.println("Checking status of MS SQL database.");
        return true;
    }

    @Override
    public void open(String url) {
        _url = url;
        System.out.println("Opening MS SQL database: " + url);
    }

    @Override
    public void close() {
        System.out.println("Closing MS SQL database.");
    }

    @Override
    public void commit() {
        System.out.println("Committing changes to MS SQL database.");
    }

    @Override
    public void rollback(String type) {
        System.out.println("Rolling back changes in MS SQL database: " + type);
    }
}