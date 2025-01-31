package task_8_Visitor;

import java.time.LocalDateTime;

class InternalAccount implements Accountable {
    private String name;
    private String owner;

    public InternalAccount(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public LocalDateTime getCreationDate() {
        return null;
    }

    @Override
    public String accept(BankAbstractVisitor visitor) {
        return visitor.visitInternal(this);
    }

    @Override
    public String toString() {
        return "InternalAccount{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}