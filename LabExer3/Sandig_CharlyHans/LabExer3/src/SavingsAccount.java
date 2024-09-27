public class SavingsAccount {
    private double balance;
    public static double interestRate = 0;

    public SavingsAccount() {
        this.balance = 0;
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return amount;
        } else {
            System.out.println("Insufficient balance. Withdrawal amount is set to 0.");
            return 0;
        }
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    public static void showBalance(SavingsAccount account) {
        System.out.printf("Current Balance: %.2f%n", account.getBalance());
    }
}
