package task_3_Command;

public class Main {
    public static void main(String[] args) {
        WindowController controller = new WindowController();
        Window window = new Window();

        CopyCommand copyCommand = new CopyCommand();
        CutCommand cutCommand = new CutCommand("SampleText", 1);
        InsertCommand insertCommand = new InsertCommand("Hello World", window);

        controller.addCommand(copyCommand);
        controller.addCommand(cutCommand);
        controller.addCommand(insertCommand);

        System.out.println("\n--- Executing all commands ---");
        controller.executeAllPendingCommands();

        System.out.println("\n--- Undoing all commands ---");
        controller.undoChanges();
    }
}

