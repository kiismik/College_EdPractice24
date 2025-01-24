package task_5_Store;

//Window
public class StoreSection extends StoreComponent {
    private String title;
    private int width;
    private int height;

    public StoreSection(String name, int width, int height, String title) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Displaying Section: " + name + " | Dimensions: " + width + "x" + height + " | Title: \"" + title + "\"");
        super.display();
    }
}
