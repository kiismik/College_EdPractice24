package task_8_Visitor;

import java.time.LocalDateTime;

interface Accountable {
    long getId();
    LocalDateTime getCreationDate();
    String accept(BankAbstractVisitor visitor);
}