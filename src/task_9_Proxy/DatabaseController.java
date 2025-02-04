package task_9_Proxy;

class DatabaseController {
    private IDatabaseAccessProxy dbHandle;

    public DatabaseController(IDatabaseAccessProxy dbHandle) {
        this.dbHandle = dbHandle;
    }

    public void addClient() {
        System.out.println("Add client to database.");
    }

    public void removeClient() {
        System.out.println("Remove client from database.");
    }

    public void modifyOrder() {
        System.out.println("Modify order in database.");
    }

    public void addOrder() {
        System.out.println("Add order to database.");
    }

    public void removeOrder() {
        System.out.println("Remove order from database.");
    }
}

