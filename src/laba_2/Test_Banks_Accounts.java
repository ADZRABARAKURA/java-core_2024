package laba_2;

public class Test_Banks_Accounts {
    public static void main(String[] args) {
        // Создаем объект банковского счета
        Banks_Accounts.BankAccount account = new Banks_Accounts.Account(1000);

        // Вносим депозит
        account.deposit(500);

        // Снимаем деньги
        account.withdraw(200);
        account.withdraw(1500); // Превышение баланса

        // Получаем текущий баланс
        System.out.println("Текущий баланс: " + account.getBalance());
    }
}
