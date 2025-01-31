package task_8_Store;

import java.time.LocalDateTime;

interface Product {
    long getId();
    LocalDateTime getAddedDate();
    String accept(StoreAbstractVisitor visitor);
}
