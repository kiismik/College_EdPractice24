package task_3_Command;

public class CopyCommand implements AbstractCommand {
    @Override
    public void execute() {
        System.out.println("Copying content...");
    }

    @Override
    public void undo() {
        System.out.println("Undoing Copy...");
    }
}

