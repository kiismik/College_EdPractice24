package task_3_Store;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        CommandManager manager = new CommandManager();

        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Headphones", 150.00);

        Command addLaptop = new AddToCartCommand(cart, product1);
        Command addHeadphones = new AddToCartCommand(cart, product2);
        Command removeLaptop = new RemoveFromCartCommand(cart, product1);
        Command checkout = new CheckoutCommand(cart);

        System.out.println("\n--- Executing commands ---");
        manager.executeCommand(addLaptop);
        manager.executeCommand(addHeadphones);
        manager.executeCommand(removeLaptop);

        System.out.println("\n--- Undoing last command ---");
        manager.undoLastCommand();

        System.out.println("\n--- Checkout ---");
        manager.executeCommand(checkout);

        System.out.println("\n--- Undoing checkout ---");
        manager.undoLastCommand();
    }
}

