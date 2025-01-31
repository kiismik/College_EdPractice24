package task_8_Visitor;

import java.time.LocalDateTime;


class Administrator extends User {
    private String department;
    private LocalDateTime hireDate;

    public Administrator(String firstName, LocalDateTime birthDate, Address address, String department, LocalDateTime hireDate) {
        super(firstName, birthDate, address);
        this.department = department;
        this.hireDate = hireDate;
    }

    public String getDepartment() {
        return department;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "department='" + department + '\'' +
                ", hireDate=" + hireDate +
                "} " + super.toString();
    }
}