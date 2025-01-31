package task_8_Store;

import java.time.LocalDateTime;

class ElectronicProduct implements Product {
    String name;
    private StoreManager manager;
    private long price;
    private boolean isWarranty;
    private ProductCategory category;

    public ElectronicProduct(String name, StoreManager manager, long price, boolean isWarranty, ProductCategory category) {
        this.name = name;
        this.manager = manager;
        this.price = price;
        this.isWarranty = isWarranty;
        this.category = category;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public LocalDateTime getAddedDate() {
        return null;
    }

    public String getCategory() {
        return category.toString();
    }

    public StoreManager getManager() {
        return manager;
    }

    public long getPrice() {
        return price;
    }

    public boolean isWarranty() {
        return isWarranty;
    }

    @Override
    public String accept(StoreAbstractVisitor visitor) {
        return visitor.visitElectronicProduct(this);
    }

    @Override
    public String toString() {
        return "ElectronicProduct{" +
                "name='" + name + '\'' +
                ", manager=" + manager +
                ", price=" + price +
                ", isWarranty=" + isWarranty +
                ", category=" + category +
                '}';
    }
}
