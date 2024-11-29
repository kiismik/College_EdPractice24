package task_3_Store;

public class CheckoutCommand implements Command {
    private Cart cart;

    public CheckoutCommand(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void execute() {
        cart.checkout();
    }

    @Override
    public void undo() {
        System.out.println("Undoing checkout is not supported.");
    }
}

