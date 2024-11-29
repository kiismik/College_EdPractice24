package task_3_Command;

import java.util.ArrayList;
import java.util.List;

public class WindowController {
    private List<AbstractCommand> commandsToExecute = new ArrayList<>();
    private List<AbstractCommand> commandHistory = new ArrayList<>();

    public void addCommand(AbstractCommand command) {
        commandsToExecute.add(command);
    }

    public void removeCommand(AbstractCommand command) {
        commandsToExecute.remove(command);
    }

    public void executeAllPendingCommands() {
        for (AbstractCommand command : commandsToExecute) {
            command.execute();
            commandHistory.add(command);
        }
        commandsToExecute.clear();
    }

    public void undoChanges() {
        for (int i = commandHistory.size() - 1; i >= 0; i--) {
            commandHistory.get(i).undo();
            commandHistory.remove(i);
        }
    }
}

