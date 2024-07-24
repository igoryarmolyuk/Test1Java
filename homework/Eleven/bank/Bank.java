package bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, BankAccount> accounts;

    // Конструктор
    public Bank() {
        accounts = new HashMap<>();
    }

    // Метод для створення нового рахунку
    public void createAccount(String accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            BankAccount newAccount = new BankAccount(accountNumber);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account created: " + accountNumber);
        } else {
            System.out.println("Account already exists.");
        }
    }

    // Метод для блокування рахунку
    public void blockAccount(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.setBlocked(true);
            System.out.println("Account has been defeated: " + accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Метод для розблокування рахунку
    public void unblockAccount(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.setBlocked(false);
            System.out.println("Account has been revived: " + accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Метод для отримання інформації про рахунок
    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    // Метод для відображення всіх рахунків
    public void printAllAccounts() {
        for (BankAccount account : accounts.values()) {
            System.out.println(account);
        }
    }
}
