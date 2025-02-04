package task_6_Store;

public class ApplicationManager {
    private OrderController orderController;

    public ApplicationManager(String platform) {
        Customer customer = new Customer("Alice", "Smith");
        Order order = new Order("12345", "Laptop", 1, customer);
        orderController = new OrderController(order);

        switch (platform.toLowerCase()) {
            case "online":
                orderController.setSalesStrategy(new OnlineSalesStrategy());
                break;
            case "retail":
                orderController.setSalesStrategy(new RetailStoreStrategy());
                break;
            case "app":
                orderController.setSalesStrategy(new AppSalesStrategy());
                break;
            default:
                System.out.println("Unsupported platform. No strategy will be set.");
        }
    }

    public void run() {
        orderController.processOrder();
        orderController.sendOrderConfirmation();
        orderController.cancelOrder();
    }
}