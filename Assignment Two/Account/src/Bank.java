public class Bank {
    public static void main(String[] args) {
        // Demo: Create accounts and perform operations
        Account account = new Account(1, 1000, "Abdirahman Yusuf");
        SavingsAccount savingsAccount = new SavingsAccount(2, 500, "Nuro Mahamud");

        account.deposit(600);
        savingsAccount.deposit(100);

        account.withdraw(400);
        savingsAccount.withdraw(60);

        savingsAccount.applyInterest(5); // 5% annual interest rate

        System.out.println("Regular Account Balance: " + account.getBalance());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        // Array for polymorphism demonstration
        Account[] accounts = new Account[]{account, savingsAccount};
        for (Account acc : accounts) {
            System.out.println(acc.getFullName() + "'s account balance: " + acc.getBalance());
        }
    }
}
