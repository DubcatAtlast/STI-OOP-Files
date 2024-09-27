import java.util.Scanner;

public class RunSavingsAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();

        System.out.print("Enter the interest rate (as a decimal, e.g., 0.05 for 5%): ");
        double rate = scanner.nextDouble();
        SavingsAccount.setInterestRate(rate);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        savings.deposit(depositAmount);

        String choice;
        do {

            System.out.print("Press D to deposit or W to withdraw (or X to exit): ");
            choice = scanner.next();

            if (choice.equalsIgnoreCase("D")) {
                System.out.print("Enter amount to deposit: ");
                depositAmount = scanner.nextDouble();
                savings.deposit(depositAmount);
            } else if (choice.equalsIgnoreCase("W")) {
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                savings.withdraw(withdrawAmount);
            }

            SavingsAccount.showBalance(savings);

            if (savings.getBalance() > 1000) {
                savings.addInterest();
            }

        } while (!choice.equalsIgnoreCase("X"));

        System.out.println("Thank you for using the Savings Account program!");
        scanner.close();
    }
}
