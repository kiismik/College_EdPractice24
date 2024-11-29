package task_3_Command;

public class CutCommand implements AbstractCommand {
    private String text;
    private int startLine;

    public CutCommand(String text, int startLine) {
        this.text = text;
        this.startLine = startLine;
    }

    @Override
    public void execute() {
        System.out.println("Cutting text: \"" + text + "\" from line " + startLine);
    }

    @Override
    public void undo() {
        System.out.println("Undoing Cut of text: \"" + text + "\" from line " + startLine);
    }
}

