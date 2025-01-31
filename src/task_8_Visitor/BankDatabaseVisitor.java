package task_8_Visitor;

class BankDatabaseVisitor implements BankAbstractVisitor {
    @Override
    public String visit(User user) {
        return "visit(User)";
    }

    @Override
    public String visit(Administrator administrator) {
        return "visit(Administrator)";
    }

    @Override
    public String visit(BankAccountType accountType) {
        return "visit(BankAccountType)";
    }

    @Override
    public String visitBank(BankAccount account) {
        String out = "Client: visit(account.client) \n";
        out += "Admin: visit(account.admin) \n";
        out += "Balance: " + account.getCurrentBalance() + "\n";
        out += "Is credit: " + account.isCredit();
        return out;
    }

    @Override
    public String visitInternal(InternalAccount account) {
        return "visit(InternalAccount)";
    }
}