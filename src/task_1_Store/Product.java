package task_1_Store;

public class Product {
    private String name;
    private String category;
    private double price;
    private short year;
    private String brand;
    private int stockQuantity;
    private double rating;
    private String description;
    public Product(String name, String category, double price, short year, String brand, int stockQuantity, double rating, String description) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.year = year;
        this.brand = brand;
        this.stockQuantity = stockQuantity;
        this.rating = rating;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public short getYear() {
        return year;
    }
    public void setYear(short year) {
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String describe() {
        return "Product: " + name +
                "\nCategory: " + category +
                "\nPrice: $" + price +
                "\nYear: " + year +
                "\nBrand: " + brand +
                "\nStock: " + stockQuantity +
                "\nRating: " + rating + "/5" +
                "\nDescription: " + description;
    }
}
