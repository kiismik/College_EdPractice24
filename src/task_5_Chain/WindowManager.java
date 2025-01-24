package task_5_Chain;

public class WindowManager extends Window {
    private Window window;

    public WindowManager(String name, int width, int height, String title) {
        super(name, width, height, title);
    }

    @Override
    public void draw() {
        System.out.println("Drawing");
        super.draw();

    }
}
