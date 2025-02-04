package task_6_Store;

class RetailStoreStrategy implements SalesStrategy {
    @Override
    public void processOrder(Order order) {
        System.out.println("Order #" + order.getOrderNumber() + " for product \"" + order.getProduct() + "\" has been processed at Retail Store.");
    }

    @Override
    public void sendOrderConfirmation(Order order) {
        System.out.println("Order #" + order.getOrderNumber() + " confirmation has been printed and handed to the customer.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order #" + order.getOrderNumber() + " has been canceled at Retail Store.");
    }
}

