package bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Створюємо рахунки
        bank.createAccount("Jacques de Aldersberg");
        bank.createAccount("Geralt from Rivia");

        // Додаємо гроші на рахунок
        BankAccount account1 = bank.getAccount("123456");
        account1.deposit(1000);

        BankAccount account2 = bank.getAccount("654321");
        account2.deposit(500);

        // Переводимо гроші між рахунками
        account1.transfer(account2, 200);

        // Відображаємо всі рахунки
        bank.printAllAccounts();

        // Блокуємо рахунок
        bank.blockAccount("123456");

        // Намагаємося зняти гроші з заблокованого рахунку
        account1.withdraw(100);

        // Розблоковуємо рахунок
        bank.unblockAccount("123456");

        // Знімаємо гроші з розблокованого рахунку
        account1.withdraw(100);

        // Відображаємо всі рахунки після операцій
        bank.printAllAccounts();
    }
}
