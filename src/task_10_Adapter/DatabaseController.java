package task_10_Adapter;

class DatabaseController {
    private IDatabaseAccessProxy dbHandle;

    public DatabaseController(IDatabaseAccessProxy dbHandle) {
        this.dbHandle = dbHandle;
    }

    public void addClient() {
        System.out.println("Adding client to database.");
    }

    public void removeClient() {
        System.out.println("Removing client from database.");
    }

    public void modifyOrder() {
        System.out.println("Modifying order in database.");
    }

    public void addOrder() {
        System.out.println("Adding order to database.");
    }

    public void removeOrder() {
        System.out.println("Removing order from database.");
    }
}
