package task_8_Store;

import java.time.LocalDateTime;

class InternalTool implements Product {
    private String toolName;
    private String owner;

    public InternalTool(String toolName, String owner) {
        this.toolName = toolName;
        this.owner = owner;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public LocalDateTime getAddedDate() {
        return null;
    }

    @Override
    public String accept(StoreAbstractVisitor visitor) {
        return visitor.visitInternalTool(this);
    }

    @Override
    public String toString() {
        return "InternalTool{" +
                "toolName='" + toolName + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
