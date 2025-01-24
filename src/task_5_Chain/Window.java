package task_5_Chain;

public class Window extends WindowComponent{
    private String _title;
    private int _width;
    private int _height;

    public Window(String name, int width, int height, String title) {
        this.name = name;
        this._width = width;
        this._height = height;
        this._title = title;
    }

    @Override
    public void draw() {
        System.out.println("Drawing: " + name + " / " + _width + " on " + _height);
        super.draw();
    }
}

