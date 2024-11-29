package task_3_Command;

public class InsertCommand implements AbstractCommand {
    private String text;
    private Window window;

    public InsertCommand(String text, Window window) {
        this.text = text;
        this.window = window;
    }

    @Override
    public void execute() {
        System.out.println("Inserting text: \"" + text + "\" into window.");
        window.insertText(text);
    }

    @Override
    public void undo() {
        System.out.println("Undoing Insert of text: \"" + text + "\" from window.");
        window.removeText(text);
    }
}

