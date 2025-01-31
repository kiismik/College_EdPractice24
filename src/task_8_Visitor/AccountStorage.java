package task_8_Visitor;

import java.util.ArrayList;
import java.util.List;

class AccountStorage {
    private List<Accountable> accounts = new ArrayList<>();
    private BankAbstractVisitor serializer;

    public void addAccount(Accountable account) {
        accounts.add(account);
    }

    public void save() {
        save("json");
    }

    public void save(String format) {
        if (format.equals("db")) {
            serializer = new BankDatabaseVisitor();
        } else if (format.equals("json")) {
            serializer = new BankJsonVisitor();
        }

        for (Accountable account : accounts) {
            System.out.println(account.accept(serializer));
        }
    }

    public void addInternalInfo(InternalAccount internalAccount) {
        accounts.add(internalAccount);
    }

    public void addBankAccountInfo(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }
}