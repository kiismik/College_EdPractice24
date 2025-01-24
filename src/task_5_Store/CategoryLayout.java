package task_5_Store;

public class CategoryLayout extends StoreComponent {
    private int width;
    private int height;

    public CategoryLayout(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public void display() {
        System.out.println("Displaying Category: " + name + " | Dimensions: " + width + "x" + height);
        super.display();
    }
}
