package laba_2;

public class Banks_Accounts {
    // Интерфейс для банковского счета
    interface BankAccount {
        void deposit(double amount); // Метод для депозита
        void withdraw(double amount); // Метод для снятия денег
        double getBalance(); // Метод для получения текущего баланса
    }

    // Класс, представляющий банковский счет
    static class Account implements BankAccount {
        private double balance;

        public Account(double initialBalance) {
            this.balance = initialBalance;
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Вы внесли " + amount + " рублей.");
        }

        @Override
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Вы сняли " + amount + " рублей.");
            } else {
                System.out.println("Недостаточно средств на счете.");
            }
        }

        @Override
        public double getBalance() {
            return balance;
        }
    }
}
