package task_8_Visitor;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Ukraine", "Kyiv region", "Kyiv", "Street 1", "District 1", "1", "Entrance 1");
        User user1 = new User("Taras", LocalDateTime.now(), address1);

        Address address2 = new Address("Ukraine", "Lviv region", "Lviv", "Street 2", "District 2", "2", "Entrance 2");
        Administrator admin1 = new Administrator("Petro", LocalDateTime.now(), address2, "IT", LocalDateTime.now());

        BankAccount bankAccount1 = new BankAccount("Client 1", admin1, 1000, true, BankAccountType.REGULAR);
        InternalAccount internalAccount1 = new InternalAccount("Account 1", "Owner 1");

        AccountStorage storage = new AccountStorage();
        storage.addAccount(user1);
        storage.addAccount(admin1);
        storage.addBankAccountInfo(bankAccount1);
        storage.addInternalInfo(internalAccount1);

        storage.save("db");
    }
}