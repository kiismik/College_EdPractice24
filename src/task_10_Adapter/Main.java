package task_10_Adapter;

public class Main {
    public static void main(String[] args) {
        IDatabaseDriverAdapter msSQLAdapter = new MsSQLDatabaseAdapter();
        DBAccess dbAccess = new DBAccess(msSQLAdapter);
        DBAccessProxy proxy = new DBAccessProxy(dbAccess);
        DatabaseController controller = new DatabaseController(proxy);

        proxy.open("jdbc://localhost:1433/mssqlDB");
        controller.addClient();
        proxy.executeQuery(new int[]{101, 202, 303});
        controller.addOrder();
        proxy.commit();
        proxy.close();
    }
}