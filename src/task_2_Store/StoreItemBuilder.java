package task_2_Store;
public class StoreItemBuilder {
    private String name;
    private double price;
    private String category;
    private int quantity;
    private String description;
    private String[] tags;
    private boolean isAvailable;
    private Size size;

    public StoreItemBuilder setBasicParams(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        return this;
    }

    public StoreItemBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public StoreItemBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public StoreItemBuilder setTags(String[] tags) {
        this.tags = tags;
        return this;
    }

    public StoreItemBuilder setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    public StoreItemBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    public StoreItem build() {
        StoreItem item = new StoreItem(name, price, category);
        item.setQuantity(quantity);
        item.setDescription(description);
        item.setTags(tags);
        item.setAvailability(isAvailable);
        item.setSize(size);
        return item;
    }
}
