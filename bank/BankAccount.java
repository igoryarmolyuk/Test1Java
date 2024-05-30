package bank;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private boolean isBlocked;

    // Конструктор
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.isBlocked = false;
    }

    // Геттери
    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    // Сеттери
    public void setBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    // Метод для додавання грошей
    public void deposit(double amount) {
        if (!isBlocked) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        } else {
            System.out.println("Account is blocked. Cannot deposit money.");
        }
    }

    // Метод для зняття грошей
    public void withdraw(double amount) {
        if (!isBlocked) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Invalid withdraw amount.");
            }
        } else {
            System.out.println("Account is blocked. Cannot withdraw money.");
        }
    }

    // Метод для переведення грошей
    public void transfer(BankAccount targetAccount, double amount) {
        if (!isBlocked && !targetAccount.isBlocked()) {
            if (amount > 0 && amount <= balance) {
                this.withdraw(amount);
                targetAccount.deposit(amount);
                System.out.println("Transferred: " + amount + " to " + targetAccount.getAccountNumber());
            } else {
                System.out.println("Invalid transfer amount.");
            }
        } else {
            System.out.println("One of the accounts is blocked. Cannot transfer money.");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", isBlocked=" + isBlocked +
                '}';
    }
}
