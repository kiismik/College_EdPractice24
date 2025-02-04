package task_6_Store;

//OutputStrategy
interface SalesStrategy {
    void processOrder(Order order);

    void sendOrderConfirmation(Order order);

    void cancelOrder(Order order);
}

