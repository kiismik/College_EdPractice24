package task_8_Visitor;

class BankJsonVisitor implements BankAbstractVisitor {
    @Override
    public String visit(User user) {
        return null;
    }

    @Override
    public String visit(Administrator administrator) {
        return null;
    }

    @Override
    public String visit(BankAccountType accountType) {
        return null;
    }

    @Override
    public String visitBank(BankAccount account) {
        return null;
    }

    @Override
    public String visitInternal(InternalAccount account) {
        return null;
    }
}