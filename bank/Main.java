package bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Створюємо рахунки
        bank.createAccount("Geralt z Rivii");
        bank.createAccount("Jacques de Aldersberg");

        // Додаємо гроші на рахунок
        BankAccount account1 = bank.getAccount("Geralt z Rivii");
        account1.deposit(250);

        BankAccount account2 = bank.getAccount("Jacques de Aldersberg");
        account2.deposit(1000);

        // Переводимо гроші між рахунками
        account1.transfer(account2, 200);

        // Відображаємо всі рахунки
        bank.printAllAccounts();

        // Блокуємо рахунок
        bank.blockAccount("Geralt z Rivii");

        // Намагаємося зняти гроші з заблокованого рахунку
        account1.withdraw(100);

        // Розблоковуємо рахунок
        bank.unblockAccount("Jacques de Aldersberg");

        // Знімаємо гроші з розблокованого рахунку
        account1.withdraw(100);

        // Відображаємо всі рахунки після операцій
        bank.printAllAccounts();
    }
}
