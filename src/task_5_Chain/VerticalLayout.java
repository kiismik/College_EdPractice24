package task_5_Chain;

public class VerticalLayout extends WindowComponent {
    private int _width;
    private int _height;

    public VerticalLayout(String name, int width, int height) {
        this.name = name;
        this._width = width;
        this._height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing : " + name + " / " + _width + " on " + _height);
        super.draw(); //
    }
}
