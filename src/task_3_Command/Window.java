package task_3_Command;

public class Window {
    private StringBuilder content = new StringBuilder();

    public void insertText(String text) {
        content.append(text);
        System.out.println("Current window content: " + content);
    }

    public void removeText(String text) {
        int index = content.lastIndexOf(text);
        if (index != -1) {
            content.delete(index, index + text.length());
        }
        System.out.println("Current window content after removal: " + content);
    }
}

