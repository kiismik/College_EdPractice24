package task_3_Store;

public class AddToCartCommand implements Command {
    private Cart cart;
    private Product product;

    public AddToCartCommand(Cart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    @Override
    public void execute() {
        cart.addProduct(product);
    }

    @Override
    public void undo() {
        cart.removeProduct(product);
    }
}

