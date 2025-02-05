package task_9_Store;

interface IStoreAccessProxy {
    String[] executeQuery(int[] productIDs);
    void executeQueryNoResult(int[] productIDs);
    boolean checkStoreStatus();
    void open(String url);
    void close();
    void commit();
    void rollback();
}
