package task_5_Store;

public class StoreManager extends StoreSection {

    public StoreManager(String name, int width, int height, String title) {
        super(name, width, height, title);
    }

    @Override
    public void display() {
        System.out.println("Displaying Store:");
        super.display();
    }
}
