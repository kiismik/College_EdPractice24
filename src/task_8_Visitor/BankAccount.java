package task_8_Visitor;

import java.time.LocalDateTime;

class BankAccount implements Accountable {
    private String client;
    private User admin;
    private long currentBalance;
    private boolean isCredit;
    private BankAccountType type;

    public BankAccount(String client, User admin, long currentBalance, boolean isCredit, BankAccountType type) {
        this.client = client;
        this.admin = admin;
        this.currentBalance = currentBalance;
        this.isCredit = isCredit;
        this.type = type;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public LocalDateTime getCreationDate() {
        return null;
    }

    public String getType() {
        return type.toString();
    }

    public User getAdmin() {
        return admin;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public boolean isCredit() {
        return isCredit;
    }

    @Override
    public String accept(BankAbstractVisitor visitor) {
        return visitor.visitBank(this);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "client='" + client + '\'' +
                ", admin=" + admin +
                ", currentBalance=" + currentBalance +
                ", isCredit=" + isCredit +
                ", type=" + type +
                '}';
    }
}