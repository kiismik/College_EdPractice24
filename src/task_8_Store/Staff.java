package task_8_Store;

import java.time.LocalDateTime;

class Staff implements Product {
    private String name;
    private LocalDateTime birthDate;
    private Address address;

    public Staff(String name, LocalDateTime birthDate, Address address) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public LocalDateTime getAddedDate() {
        return birthDate;
    }

    @Override
    public String accept(StoreAbstractVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", address=" + address +
                '}';
    }
}
