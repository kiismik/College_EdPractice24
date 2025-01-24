package task_5_Chain;

public class Main {
    public static void main(String[] args) {

        WindowManager manager = new WindowManager("SuperManager", 100, 100, "MainWindow");

        VerticalLayout layout = new VerticalLayout("AmazingLayout", 200, 200);
        manager.addComponent(layout);

        layout.addComponent(new Button("Button1", "Hi", "/images/hi.jpg"));
        layout.addComponent(new Button("Button2", "Bye", "/images/bye.jpg"));

        manager.draw();

        try {
            Button button = new Button("Button3", "How are you ? ", "/images/img1.png");
            button.addComponent(new Button("Button4", "Where are you ?", "/images/img2.png"));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
