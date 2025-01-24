package task_6_Store;

class OrderController {
    private Order order;
    private SalesStrategy salesStrategy;

    public OrderController(Order order) {
        this.order = order;
    }

    public void setSalesStrategy(SalesStrategy strategy) {
        this.salesStrategy = strategy;
    }

    public void processOrder() {
        if (salesStrategy != null) {
            salesStrategy.processOrder(order);
        } else {
            System.out.println("No sales strategy set.");
        }
    }

    public void sendOrderConfirmation() {
        if (salesStrategy != null) {
            salesStrategy.sendOrderConfirmation(order);
        } else {
            System.out.println("No sales strategy set.");
        }
    }

    public void cancelOrder() {
        if (salesStrategy != null) {
            salesStrategy.cancelOrder(order);
        } else {
            System.out.println("No sales strategy set.");
        }
    }
}
