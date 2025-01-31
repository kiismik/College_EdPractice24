package task_8_Visitor;

import java.time.LocalDateTime;

class User implements Accountable{
    private String firstName;
    private LocalDateTime birthDate;
    private Address address;

    public User(String firstName, LocalDateTime birthDate, Address address) {
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public LocalDateTime getCreationDate() {
        return birthDate;
    }

    @Override
    public String accept(BankAbstractVisitor visitor) {
        return visitor.visit(this);
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", birthDate=" + birthDate +
                ", address=" + address +
                '}';
    }
}