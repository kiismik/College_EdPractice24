package task_9_Proxy;

public class Main {
    public static void main(String[] args) {
        DBAccess realDB = new DBAccess();
        DBAccessProxy proxy = new DBAccessProxy(realDB);
        DatabaseController controller = new DatabaseController(proxy);

        proxy.open("jdbc://localHost:234665/database");
        controller.addClient();
        proxy.executeQuery(new int[]{1, 2, 3});
        controller.addOrder();
        proxy.commit();
        proxy.close();
    }
}
