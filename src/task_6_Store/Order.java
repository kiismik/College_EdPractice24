package task_6_Store;

// documents
class Order {
    private String orderNumber;
    private String product;
    private int quantity;
    private Customer customer;

    public Order(String orderNumber, String product, int quantity, Customer customer) {
        this.orderNumber = orderNumber;
        this.product = product;
        this.quantity = quantity;
        this.customer = customer;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Customer getCustomer() {
        return customer;
    }
}

