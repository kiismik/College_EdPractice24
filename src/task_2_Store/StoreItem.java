package task_2_Store;

public class StoreItem {
    private String name;
    private double price;
    private String category;
    private int quantity;
    private String description;
    private String[] tags;
    private boolean isAvailable;
    private Size size;

    public StoreItem(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String[] getTags() { return tags; }
    public void setTags(String[] tags) { this.tags = tags; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailability(boolean isAvailable) { this.isAvailable = isAvailable; }

    public Size getSize() { return size; }
    public void setSize(Size size) { this.size = size; }

}
