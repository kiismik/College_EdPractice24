package task_5_Chain;

public class Button extends WindowComponent {
    private String _text;
    private String _imagePath;

    public Button(String name, String text, String imagePath) {
        this.name = name;
        this._text = text;
        this._imagePath = imagePath;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Component: " + name + "; text: \"" + _text + "\"; image: \"" + _imagePath + "\"");
    }

    @Override
    public void addComponent(WindowComponent component) {
        throw new UnsupportedOperationException("Cannot add component to a button.");
    }

    @Override
    public void removeComponent(String name) {
        throw new UnsupportedOperationException("Cannot remove component from a button.");
    }
}
