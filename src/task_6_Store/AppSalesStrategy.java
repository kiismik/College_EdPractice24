package task_6_Store;

class AppSalesStrategy implements SalesStrategy {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order #" + order.getOrderNumber() + " for product \"" + order.getProduct() + "\" has been processed via Mobile App.");
    }

    @Override
    public void sendOrderConfirmation(Order order) {
        System.out.println("Confirmation for order #" + order.getOrderNumber() + " has been sent via push notification.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order #" + order.getOrderNumber() + " has been canceled via Mobile App.");
    }
}

