package task_3_Store;

public class RemoveFromCartCommand implements Command {
    private Cart cart;
    private Product product;

    public RemoveFromCartCommand(Cart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    @Override
    public void execute() {
        cart.removeProduct(product);
    }

    @Override
    public void undo() {
        cart.addProduct(product);
    }
}

