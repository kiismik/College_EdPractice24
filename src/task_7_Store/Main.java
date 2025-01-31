package task_7_Store;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IProductWrapper wrappee = new BaseProductWrapper();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter platform (online, retail): ");
        String platform = scanner.nextLine();

        System.out.println("Enter loyalty discount percentage (enter 0 if none): ");
        double loyaltyDiscount = scanner.nextDouble();

        System.out.println("Enter seasonal discount percentage (enter 0 if none): ");
        double seasonalDiscount = scanner.nextDouble();

        if (platform.equalsIgnoreCase("online")) {
            wrappee = new OnlineStoreWrapper(wrappee, "Online Store");
        } else if (platform.equalsIgnoreCase("retail")) {
            wrappee = new RetailStoreWrapper(wrappee, "Retail Store");
        }

        if (loyaltyDiscount > 0) {
            wrappee = new DiscountWrapper(wrappee, loyaltyDiscount);
        }

        if (seasonalDiscount > 0) {
            wrappee = new DiscountWrapper(wrappee, seasonalDiscount);
        }

        StoreController storeController = new StoreController(wrappee);

        StoreProduct product = new StoreProduct(
                ProductCategory.ELECTRONICS,
                "Smartphone",
                500.00
        );

        storeController.addProductToStore(product);
    }
}
