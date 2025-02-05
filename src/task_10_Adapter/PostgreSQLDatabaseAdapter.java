package task_10_Adapter;

class PostgreSQLDatabaseAdapter implements IDatabaseDriverAdapter {
    private String _url;

    @Override
    public String[] executeQuery(int[] lineNumbers) {
        System.out.println("Executing query on PostgreSQL database.");
        return new String[]{"PostgreSQL Result1", "PostgreSQL Result2"};
    }

    @Override
    public void executeQueryNoResult(int[] lineNumbers) {
        System.out.println("Executing query with no result on PostgreSQL database.");
    }

    @Override
    public boolean checkDatabaseStatus() {
        System.out.println("Checking status of PostgreSQL database.");
        return true;
    }

    @Override
    public void open(String url) {
        _url = url;
        System.out.println("Opening PostgreSQL database: " + url);
    }

    @Override
    public void close() {
        System.out.println("Closing PostgreSQL database.");
    }

    @Override
    public void commit() {
        System.out.println("Committing changes to PostgreSQL database.");
    }

    @Override
    public void rollback(String type) {
        System.out.println("Rolling back changes in PostgreSQL database: " + type);
    }
}
