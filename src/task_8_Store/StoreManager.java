package task_8_Store;

import java.time.LocalDateTime;

class StoreManager extends Staff {
    private String department;
    private LocalDateTime hireDate;

    public StoreManager(String name, LocalDateTime birthDate, Address address, String department, LocalDateTime hireDate) {
        super(name, birthDate, address);
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
        return "StoreManager{" +
                "department='" + department + '\'' +
                ", hireDate=" + hireDate +
                "} " + super.toString();
    }
}
