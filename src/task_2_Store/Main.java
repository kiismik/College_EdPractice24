package task_2_Store;

public class Main {
    public static void main(String[] args) {

        StoreItemBuilder builder = new StoreItemBuilder();

        StoreItem macbookPro = builder.setBasicParams("MacBook Pro M1", 2500.00, "Electronics")
                .setQuantity(5)
                .setDescription("High-performance laptop with Apple M1 chip")
                .setTags(new String[]{"laptop", "Apple", "M1", "high-performance"})
                .setAvailability(true)
                .setSize(new Size(30, 20))
                .build();

        StoreItem woodTable = builder.setBasicParams("Wooden Table", 350.00, "Furniture")
                .setQuantity(3)
                .setDescription("Elegant wooden table for office")
                .setTags(new String[]{"furniture", "wood", "office", "elegant"})
                .setAvailability(true)
                .setSize(new Size(120, 80))
                .build();

        StoreItem notebook = builder.setBasicParams("Notebook", 5.00, "Stationery")
                .setQuantity(100)
                .setDescription("Simple notebook for everyday use")
                .setTags(new String[]{"stationery", "paper", "notebook"})
                .setAvailability(true)
                .setSize(new Size(21, 15))
                .build();

        System.out.println("Item: " + macbookPro.getName() + ", Price: " + macbookPro.getPrice());
        System.out.println("Size: " + macbookPro.getSize().getHeight() + "x" + macbookPro.getSize().getWidth());
        System.out.println("Description: " + macbookPro.getDescription());

        System.out.println("\nItem: " + woodTable.getName() + ", Price: " + woodTable.getPrice());
        System.out.println("Size: " + woodTable.getSize().getHeight() + "x" + woodTable.getSize().getWidth());
        System.out.println("Description: " + woodTable.getDescription());

        System.out.println("\nItem: " + notebook.getName() + ", Price: " + notebook.getPrice());
        System.out.println("Size: " + notebook.getSize().getHeight() + "x" + notebook.getSize().getWidth());
        System.out.println("Description: " + notebook.getDescription());
    }
}
